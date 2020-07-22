package com.example.sahil.design_patterns.behavioural.iterator;

public interface ChannelCollection {

	void addChannel(Channel c);
	
	void removeChannel(Channel c);
	
	ChannelIterator iterator(ChannelTypeEnum type);
	
}