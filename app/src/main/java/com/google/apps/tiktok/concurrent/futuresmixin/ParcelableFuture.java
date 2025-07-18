package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.vrq;
import defpackage.ypv;
import defpackage.yqt;
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ParcelableFuture implements Parcelable {
    public boolean a;
    public yqt b;
    public Throwable c;
    private final int e;
    private Object f;
    private Object g;
    private static final zdy d = zdy.h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator CREATOR = new vrq();

    public ParcelableFuture(Parcel parcel) {
        this.b = ypv.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.e = parcel.readInt();
        try {
            this.f = parcel.readValue(classLoader);
            int i = parcel.readInt();
            this.b = yqt.i(Integer.valueOf(i));
            if (i == 1) {
                this.a = true;
                this.g = parcel.readValue(classLoader);
                this.c = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) d.c()).p(e)).q("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).v("Failed to unparcel value for %d.", this.e);
            this.a = true;
            this.c = e;
        }
    }

    private static void a(Object obj, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(iDataPosition);
            ((zdv) ((zdv) ((zdv) d.c()).p(e)).q("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).u("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object obj = this.f;
        String strX = obj != null ? a.x(obj, "input=", ";") : "";
        Object obj2 = this.g;
        String strX2 = obj2 != null ? a.x(obj2, "result=", ";") : "";
        Throwable th = this.c;
        return "ParcelableFuture(" + strX + strX2 + (th != null ? a.x(th, "error=", ";") : "") + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        try {
            a(this.f, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.a = true;
            this.c = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.g = null;
        }
        parcel.writeInt(true != this.a ? 2 : 1);
        if (this.a) {
            try {
                a(this.g, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.c = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                a(this.c, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.c))), e3);
                this.c = illegalArgumentException;
                a(illegalArgumentException, parcel);
            }
        }
    }
}
