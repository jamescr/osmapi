package de.westnordost.osmapi.changesets;


import java.io.Serializable;
import java.time.Instant;

import de.westnordost.osmapi.user.User;

/** A post in the changeset discussion. Avoided the wording "changeset comment" here, because this
 *  is already what the "commit message" is called in editors */
public class ChangesetNote implements Serializable
{
	private static final long serialVersionUID = 2L;

	public Instant createdAt;
	public User user;
	public String text;
}
