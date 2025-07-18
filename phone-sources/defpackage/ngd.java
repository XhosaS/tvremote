package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngd extends RecyclerView.LayoutParams implements nfx {
    public static final Parcelable.Creator<ngd> CREATOR = new mur(13);
    private float a;
    private float b;
    private int c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public ngd() {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.c = -1;
        this.d = -1.0f;
        this.g = 16777215;
        this.h = 16777215;
    }

    @Override // defpackage.nfx
    public final float a() {
        return this.d;
    }

    @Override // defpackage.nfx
    public final float b() {
        return this.a;
    }

    @Override // defpackage.nfx
    public final float c() {
        return this.b;
    }

    @Override // defpackage.nfx
    public final int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.nfx
    public final int e() {
        return this.height;
    }

    @Override // defpackage.nfx
    public final int f() {
        return this.bottomMargin;
    }

    @Override // defpackage.nfx
    public final int g() {
        return this.leftMargin;
    }

    @Override // defpackage.nfx
    public final int h() {
        return this.rightMargin;
    }

    @Override // defpackage.nfx
    public final int i() {
        return this.topMargin;
    }

    @Override // defpackage.nfx
    public final int j() {
        return this.h;
    }

    @Override // defpackage.nfx
    public final int k() {
        return this.g;
    }

    @Override // defpackage.nfx
    public final int l() {
        return this.f;
    }

    @Override // defpackage.nfx
    public final int m() {
        return this.e;
    }

    @Override // defpackage.nfx
    public final int n() {
        return 1;
    }

    @Override // defpackage.nfx
    public final int o() {
        return this.width;
    }

    @Override // defpackage.nfx
    public final void p(int i) {
        this.f = i;
    }

    @Override // defpackage.nfx
    public final void q(int i) {
        this.e = i;
    }

    @Override // defpackage.nfx
    public final boolean r() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    public ngd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        this.b = 1.0f;
        this.c = -1;
        this.d = -1.0f;
        this.g = 16777215;
        this.h = 16777215;
    }

    public ngd(Parcel parcel) {
        super(-2, -2);
        this.a = 0.0f;
        this.b = 1.0f;
        this.c = -1;
        this.d = -1.0f;
        this.g = 16777215;
        this.h = 16777215;
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
