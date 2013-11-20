package de.gravitex.processing.logic;

import java.util.List;

import de.gravitex.processing.entity.ProcessItem;

public interface TestRemote {

    public void sayMoo();
    
    public void sayMee();
    
    public List<ProcessItem> findAllProcessItems();
    
    public void createProcessItem(ProcessItem processItem) throws MyException;
}
