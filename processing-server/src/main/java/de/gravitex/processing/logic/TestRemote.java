package de.gravitex.processing.logic;

import java.util.List;

import de.gravitex.processing.entity.ProcessItemEntity;

public interface TestRemote {

    public void sayMoo();
    
    public void sayMee();
    
    public List<ProcessItemEntity> findAllProcessItems();
    
    public void createProcessItem(ProcessItemEntity processItem) throws MyException;
}
