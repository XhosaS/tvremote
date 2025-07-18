package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeen extends aarv {
    public static int g(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public static int h(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public static int i(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public static int j(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public static int k(aart aartVar, int[] iArr) {
        int length = iArr.length;
        aartVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return aartVar.e();
            }
            aartVar.i(iArr[length]);
        }
    }

    public static aeen l(ByteBuffer byteBuffer) {
        aeen aeenVar = new aeen();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aeenVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aeenVar;
    }

    public final String m() {
        int iA = a(4);
        if (iA != 0) {
            return d(iA + this.a);
        }
        return null;
    }
}
