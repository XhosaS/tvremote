package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bso extends bsq {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public bso(brm brmVar, String str) {
        super(brmVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor p() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        bri.b(21, "no row");
        throw new agpb();
    }

    private final void q(int i, int i2) {
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

    private final void r() {
        if (this.i == null) {
            brm brmVar = this.f;
            final bsn bsnVar = new bsn(this);
            final agvd agvdVar = new agvd() { // from class: bru
                @Override // defpackage.agvd
                public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                    SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                    String str = (String) obj3;
                    SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                    bry bryVar = brz.a;
                    sQLiteQuery.getClass();
                    bsi bsiVar = new bsi(sQLiteQuery);
                    bso bsoVar = ((bsn) bsnVar).a;
                    int length = bsoVar.a.length;
                    for (int i = 1; i < length; i++) {
                        int i2 = bsoVar.a[i];
                        if (i2 == 1) {
                            bsiVar.a.bindLong(i, bsoVar.b[i]);
                        } else if (i2 == 2) {
                            bsiVar.a.bindDouble(i, bsoVar.c[i]);
                        } else if (i2 == 3) {
                            String str2 = bsoVar.d[i];
                            str2.getClass();
                            bsiVar.a.bindString(i, str2);
                        } else if (i2 == 4) {
                            byte[] bArr = bsoVar.e[i];
                            bArr.getClass();
                            bsiVar.a.bindBlob(i, bArr);
                        } else if (i2 == 5) {
                            bsiVar.a.bindNull(i);
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: brv
                /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    bry bryVar = brz.a;
                    return agvdVar.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            bso bsoVar = bsnVar.a;
            Cursor cursorRawQueryWithFactory = ((brz) brmVar).f.rawQueryWithFactory(cursorFactory, bsoVar.g, brz.c, null);
            cursorRawQueryWithFactory.getClass();
            this.i = cursorRawQueryWithFactory;
        }
    }

    private final void s(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            bri.b(25, "column index out of range");
            throw new agpb();
        }
    }

    @Override // defpackage.brj
    public final int a() {
        o();
        r();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.brj
    public final long b(int i) {
        o();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.getLong(i);
    }

    @Override // defpackage.brj
    public final String c(int i) {
        o();
        r();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        s(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.brj, java.lang.AutoCloseable
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
        this.h = true;
    }

    @Override // defpackage.brj
    public final String d(int i) {
        o();
        Cursor cursorP = p();
        s(cursorP, i);
        String string = cursorP.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.brj
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        q(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.brj
    public final void f(int i, double d) {
        o();
        q(2, i);
        this.a[i] = 2;
        this.c[i] = d;
    }

    @Override // defpackage.brj
    public final void g(int i, long j) {
        o();
        q(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.brj
    public final void h(int i) {
        o();
        q(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.brj
    public final void i(int i, String str) {
        str.getClass();
        o();
        q(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.brj
    public final void j() {
        o();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.brj
    public final boolean k(int i) {
        o();
        Cursor cursorP = p();
        s(cursorP, i);
        return cursorP.isNull(i);
    }

    @Override // defpackage.brj
    public final boolean l() {
        o();
        r();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.brj
    public final byte[] m(int i) {
        o();
        Cursor cursorP = p();
        s(cursorP, i);
        byte[] blob = cursorP.getBlob(i);
        blob.getClass();
        return blob;
    }
}
