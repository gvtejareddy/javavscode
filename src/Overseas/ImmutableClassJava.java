package Overseas;

import java.util.Date;
import java.util.List;

public final class ImmutableClassJava {

    private final Integer immutableField1;

    private final String immutableField2;

    private final Date mutableField;
    
    List<String> list = List.of("Learning", "Web", "Site", "Java", "Goal");

    private ImmutableClassJava(Integer immutableField1, String immutableField2, Date mutableField) {

        this.immutableField1 = immutableField1;

        this.immutableField2 = immutableField2;
        this.mutableField = new Date(mutableField.getTime());
    }

    public static ImmutableClassJava getInstanceOf(Integer immutableField1, String immutableField2, Date mutableField){
        return new ImmutableClassJava(immutableField1, immutableField2, mutableField);
    }

    



}
