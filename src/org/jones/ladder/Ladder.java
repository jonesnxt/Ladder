package org.jones.ladder;

// so this will basically be a private sidechain to bitcoin with a hybrid proof of work to enable proof of stake and participation in the system.
// we have a small proof of work to enable transactions every once in a while as well as a small proof of work to send a message, a hashcash type fee system
// I'm not worried about security so much with this proof of work because this chain is private, the goal here is to avoid ddos as well as keep accurate time within the system
// sybil attacks are a consideration here, will probably need to put something in to this effect

// the proof of stake side should be a tf type system with available forgers identified by their proof of work signature in the chain in the last few blocks.

// every hour or so, the block producer will be liable for sending a bitcoin tx into the main chain with a hash of the current merkle root to timestamp the chain.
// this will let us keep accurate time and publically validate our internal timestamps with the outside world, every hour comes out to about 2 dollars a day, we can make it less if thats too much
// the data we want to store in here is basically anything that would benefit from having a provable and auditable timestamp to it.
// we can have messages that are point to point encrypted through the network, we have document timestamping where you would just upload a file, we could get a git integration, where we can
// hash the current state of our repo to prove that a commit occured at a certain time, as well as utxo transactions on self defined tokens throughout different account structures
// I like utxo here because it is easy to limit to one output per block, keeping things easy to find consensus.
// the tokens can be used to keep track of any type of ledger based system. the entire system is built into a database and is easily accesible through sql queries if needed.
// as far as data storage is concerned we might run into a problem, the sender nodes don't really have to keep all of the chain data, and can just keep the block headers.
// a few places need to keep the full chain though so that the consensus and data can be kept somehow, that can really only be a main and a backup somewhere though.
// this all happens internally, and everything is encrypted with a users key which is identified by the pow tx that initializes their session, so security should be fine.

public class Ladder {
	
	private Chain blockchain;
	private Peer[] peerlist;
	private Account self;
	
	public Ladder()
	{
		blockchain = new Chain();
		
	}
	
	
	
	
	
	public void main(String args[])
	{
		new Ladder();
	}
}
