package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aefm extends aarv {
    public static int h(aart aartVar, int i, int i2, int i3, int i4) {
        aartVar.o(4);
        aartVar.t(3, i4);
        aartVar.t(2, i3);
        aartVar.t(1, i2);
        aartVar.t(0, i);
        return aartVar.d();
    }

    public static aefm j(ByteBuffer byteBuffer) {
        aefm aefmVar = new aefm();
        n(byteBuffer, aefmVar);
        return aefmVar;
    }

    public static void n(ByteBuffer byteBuffer, aefm aefmVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aefmVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public final int g() {
        int iA = a(8);
        if (iA != 0) {
            return c(iA);
        }
        return 0;
    }

    public final aefm i(int i) {
        aefm aefmVar = new aefm();
        int iA = a(8);
        if (iA == 0) {
            return null;
        }
        int iB = b(iA) + (i * 4);
        aefmVar.e(iB + this.b.getInt(iB), this.b);
        return aefmVar;
    }

    public final aefs k() {
        aefs aefsVar = new aefs();
        int iA = a(4);
        if (iA == 0) {
            return null;
        }
        int i = iA + this.a;
        aefsVar.e(i + this.b.getInt(i), this.b);
        return aefsVar;
    }

    public final aeft l() {
        aeft aeftVar = new aeft();
        int iA = a(6);
        if (iA == 0) {
            return null;
        }
        int i = iA + this.a;
        aeftVar.e(i + this.b.getInt(i), this.b);
        return aeftVar;
    }

    public final String m() {
        int iA = a(10);
        if (iA != 0) {
            return d(iA + this.a);
        }
        return null;
    }
}
