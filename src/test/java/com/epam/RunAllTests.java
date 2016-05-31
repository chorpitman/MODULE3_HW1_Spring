package com.epam;

import com.epam.facade.BookingFacadeImplTest;
import com.epam.service.EventServiceTest;
import com.epam.service.TicketServiceTest;
import com.epam.service.UserServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserServiceTest.class,
        EventServiceTest.class,
        TicketServiceTest.class,
        BookingFacadeImplTest.class
})
public class RunAllTests {//FIXME why do you have two Suit Tests (TestAllServices)???
}
