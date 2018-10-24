/**
 * Class for team.
 */
class Team implements Comparable<Team> {
	String teamname;
	int wins, losses, draws;
	/**
	 * Constructs the object for team.
	 *
	 * @param      teamname  The teamname
	 * @param      wins      The wins
	 * @param      losses    The losses
	 * @param      draws     The draws
	 */
	Team(String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	/**
	 * Gets the teamname.
	 * best case: O(1)
     * worst case: O(1)
     * aversge case: O(1)
	 * @return     The teamname.
	 */
	public String getTeamname() {
          return this.teamname;
	}
	/**
	 * Gets the wins.
 	 * best case: O(1)
     * worst case: O(1)
     * aversge case: O(1)
	 * @return     The wins.
	 */
	public int getWins() {
		return this.wins;
	}
	/**
	 * Gets the losses.
	 * best case: O(1)
     * worst case: O(1)
     * aversge case: O(1)
	 * @return     The losses.
	 */
	public int getLosses() {
		return this.losses;
	}
	/**
	 * Gets the draws.
	 * best case: O(1)
     * worst case: O(1)
     * aversge case: O(1)
	 * @return     The draws.
	 */
	public int getDraws() {
		return this.draws;
	}
/**
	 * Sets the teamname.
	 *
	 * @param      teamname  The teamname
	 */
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	/**
	 * Sets the wins.
	 *
	 * @param      wins  The wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}
	/**
	 * Sets the losses.
	 *
	 * @param      losses  The losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	/**
	 * Sets the draws.
	 *
	 * @param      draws  The draws
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.teamname;
	}
	/**
	 * { compares two objects for given condition }
	 *
	 * @param      that  The that
	 *
	 * @return     { returns -1 if condition is satisfied }
	 */
	public int compareTo(Team that) {
		if(this.wins > that.wins) {
			return -1;
		}
		if(this.wins < that.wins) {
			return 1;
		}
		if(this.losses < that.losses) {
			return -1;
		}
		if(this.losses > that.losses) {
			return 1;
		}
		if(this.draws > that.draws) {
			return -1;
		}
		if(this.draws < that.draws) {
			return 1;
		}
		return 0;
	}
    
}

