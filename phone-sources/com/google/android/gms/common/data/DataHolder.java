package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.a;
import defpackage.nub;
import defpackage.ocg;
import defpackage.ocv;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataHolder extends ocg implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new nub(17);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i = false;
    private final boolean j = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.j && this.d.length > 0 && !b()) {
                close();
                Log.e("DataBuffer", a.ch(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int iV = ocv.v(parcel);
        ocv.P(parcel, 1, strArr);
        ocv.R(parcel, 2, this.d, i);
        ocv.B(parcel, 3, this.e);
        ocv.E(parcel, 4, this.f);
        ocv.B(parcel, 1000, this.a);
        ocv.x(parcel, iV);
        if ((i & 1) != 0) {
            close();
        }
    }
}
