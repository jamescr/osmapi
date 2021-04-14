package de.westnordost.osmapi.user;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import de.westnordost.osmapi.TestUtils;

import static org.junit.Assert.*;

public class PermissionsParserTest
{
	@Test public void permissionsParser() throws IOException
	{
		String xml =
				"<permissions>" +
				"	<permission name=\"allow_xyz\" />" +
				"	<permission name=\"allow_abc\" />" +
				"</permissions>";

		List<String> permissions = new PermissionsParser().parse(TestUtils.asInputStream(xml));
		assertTrue(permissions.contains("allow_xyz"));
		assertTrue(permissions.contains("allow_abc"));
		assertFalse(permissions.contains("allow_somethingElse"));
	}
}
