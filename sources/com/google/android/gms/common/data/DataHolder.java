package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.afi;
import defpackage.ajh;
import defpackage.b;
import defpackage.qq;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataHolder extends ajh implements Closeable {
    public static final Parcelable.Creator CREATOR = new afi(6);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    boolean h = false;
    private final boolean i = true;

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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.h) {
                this.h = true;
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
        boolean z;
        try {
            if (this.i && this.d.length > 0) {
                synchronized (this) {
                    z = this.h;
                }
                if (!z) {
                    close();
                    Log.e("DataBuffer", b.i(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int iH = qq.h(parcel);
        qq.v(parcel, 1, strArr);
        qq.x(parcel, 2, this.d, i);
        qq.m(parcel, 3, this.e);
        qq.o(parcel, 4, this.f);
        qq.m(parcel, 1000, this.a);
        qq.j(parcel, iH);
        if ((i & 1) != 0) {
            close();
        }
    }
}
