package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class res {
    public int a;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;

    public res() {
        throw null;
    }

    public final ret a() {
        if (this.c == 3) {
            ret retVar = new ret((Drawable) this.d, this.a, this.b, (tst) this.e);
            int i = retVar.b;
            sij.x((i != -1) ^ (retVar.a != null), "Either icon id or icon drawable must be specified");
            return retVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" iconResId");
        }
        if ((this.c & 2) == 0) {
            sb.append(" useTint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null group");
        }
        this.d = str;
    }

    public res(byte[] bArr) {
        this.e = trk.a;
    }

    public res(char[] cArr) {
    }
}
