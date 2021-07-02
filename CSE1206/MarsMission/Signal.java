package MarsMission;


import exceptions.NoInformationFoundException;


public interface Signal {
    
    void checkSignal() throws NoInformationFoundException;
}
