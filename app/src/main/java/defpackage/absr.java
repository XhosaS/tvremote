package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absr {
    public static yyk a(List list) {
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            yzq yzqVar = absi.a;
            abuj abujVar = abuj.a;
            abug abugVar = new abug();
            int i2 = 3;
            switch (iIntValue) {
                case 68344477:
                case 69195241:
                case 69605552:
                case 70557198:
                case 72867899:
                case 73814155:
                case 75916514:
                case 81806614:
                case 82159412:
                case 87388084:
                case 96817595:
                case 101527765:
                case 104903338:
                case 108180415:
                case 108436427:
                case 109303191:
                case 111538494:
                case 112573462:
                case 112976253:
                case 114872520:
                case 115095178:
                case 116396109:
                case 117714891:
                case 122381546:
                case 122395678:
                case 122975727:
                case 127255101:
                case 127380830:
                case 128376602:
                case 134092141:
                    i2 = 4;
                    break;
                case 68435380:
                case 70701636:
                case 72175901:
                case 104729802:
                case 105535705:
                case 110734447:
                case 126290990:
                    break;
                case 70251319:
                case 72702104:
                case 73833047:
                case 75443034:
                case 76390225:
                    i2 = 2;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            if ((abugVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abugVar.y();
            }
            abuj abujVar2 = (abuj) abugVar.b;
            abujVar2.c = i2 - 1;
            abujVar2.b |= 1;
            boolean zContains = absi.a.contains(num);
            if ((abugVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abugVar.y();
            }
            abuj abujVar3 = (abuj) abugVar.b;
            abujVar3.b = 2 | abujVar3.b;
            abujVar3.d = zContains;
            yyfVar.g((abuj) abugVar.v());
        }
        return yyfVar.f();
    }
}
