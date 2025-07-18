package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gif extends gih {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public gif(ghk ghkVar, String str) {
        super(ghkVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor q() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        gez.u(21, "no row");
        throw new yfs();
    }

    private final void r(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                jArrCopyOf.getClass();
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                dArrCopyOf.getClass();
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                objArrCopyOf.getClass();
                this.d = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            objArrCopyOf2.getClass();
            this.e = (byte[][]) objArrCopyOf2;
        }
    }

    private final void s() {
        if (this.i == null) {
            this.i = this.f.a(new gie(this));
        }
    }

    private static final void t(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            gez.u(25, "column index out of range");
            throw new yfs();
        }
    }

    @Override // defpackage.ghi
    public final int a() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.ghi
    public final long b(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        return cursorQ.getLong(i);
    }

    @Override // defpackage.ghi
    public final String c(int i) {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        t(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.ghi, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            o();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            j();
        }
        p();
    }

    @Override // defpackage.ghi
    public final String d(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        String string = cursorQ.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ghi
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        r(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.ghi
    public final void f(int i, double d) {
        o();
        r(2, i);
        this.a[i] = 2;
        this.c[i] = d;
    }

    @Override // defpackage.ghi
    public final void g(int i, long j) {
        o();
        r(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.ghi
    public final void h(int i) {
        o();
        r(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.ghi
    public final void i(int i, String str) {
        str.getClass();
        o();
        r(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.ghi
    public final void j() {
        o();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.ghi
    public final boolean k(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        return cursorQ.isNull(i);
    }

    @Override // defpackage.ghi
    public final boolean l() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ghi
    public final byte[] m(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        byte[] blob = cursorQ.getBlob(i);
        blob.getClass();
        return blob;
    }
}
