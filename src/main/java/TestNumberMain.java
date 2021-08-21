import javax.xml.bind.DatatypeConverter;

public class TestNumberMain {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        Testnumber.TestNumber tn = Testnumber.TestNumber.newBuilder()
//                .setF64(9_000_000_000_000_000_000L)
//                .setSf64(-9_000_000_000_000_000_000L)
                .setI64(Long.MAX_VALUE)
//                .setS64(-9_000_000_000_000_000_000L)
//                .setS32(-2_000_000_000)
//                .setI32(2_000_000_000)
//                .setSf32(-2_000_000_000)
//                .setF32(2_000_000_000)
//                .setD(1.23)
//                .setF(1.23F)
                .build();

        System.out.println(DatatypeConverter.printHexBinary(tn.toByteArray()));
    }
}
