package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llt extends Exception implements Parcelable {
    public static final Parcelable.Creator<llt> CREATOR = new jbu(16);
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final tst e;

    public llt(int i, int i2, Throwable th, boolean z, boolean z2, tst tstVar) {
        super(th);
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = tstVar;
    }

    public final int a() {
        int i = this.a;
        switch (i) {
            case 1:
                return 12;
            case 2:
            case 3:
                return 23;
            case 4:
                return 22;
            case 5:
                return 10;
            case 6:
                return 1;
            case 7:
                return 6;
            case 8:
                return 20;
            case 9:
                return 15;
            case 10:
                return 19;
            case 11:
                return 7;
            case 12:
                return 2;
            default:
                switch (i) {
                    case 15:
                        return 4;
                    case 16:
                        return 3;
                    case 17:
                        return 14;
                    case 18:
                        return 13;
                    case 19:
                        return 21;
                    default:
                        switch (i) {
                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                return 18;
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                return 17;
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                return 16;
                            default:
                                return 0;
                        }
                }
        }
    }

    public final ieg b() {
        ieg iegVarF = ieg.a;
        int i = this.a;
        if (i == 14) {
            iegVarF = ieg.f("mobile_movie_playerror_408");
        }
        if (i == 14 || i == 27 || i == 33 || i == 38 || i == 39 || i == 41 || i == 42) {
            int i2 = this.b;
            if (i2 == 0) {
                return ieg.f("mobile_movie_playerror_0");
            }
            if (i2 == 16) {
                return ieg.f("mobile_movie_playerror_16");
            }
            if (i2 == 400) {
                return ieg.f("mobile_movie_playerror_400");
            }
            if (i2 == 408) {
                return ieg.f("mobile_movie_playerror_408");
            }
            if (i2 == 1001) {
                return ieg.f("mobile_movie_playerror_1001");
            }
            if (i2 == 1450) {
                return ieg.f("mobile_movie_playerror_1450");
            }
        }
        return iegVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r4 = this;
            int r0 = r4.a
            r1 = 0
            if (r0 == 0) goto L5c
            r2 = 1
            if (r0 == r2) goto L5c
            r3 = 2
            if (r0 == r3) goto L5c
            r3 = 3
            if (r0 == r3) goto L5c
            r3 = 7
            if (r0 == r3) goto L5c
            r3 = 10
            if (r0 == r3) goto L49
            r3 = 17
            if (r0 == r3) goto L5c
            r3 = 31
            if (r0 == r3) goto L5c
            r3 = 33
            if (r0 == r3) goto L5c
            r3 = 39
            if (r0 == r3) goto L5c
            r3 = 53
            if (r0 == r3) goto L5c
            r3 = 57
            if (r0 == r3) goto L5c
            r3 = 65
            if (r0 == r3) goto L5c
            r3 = 67
            if (r0 == r3) goto L5c
            r3 = 26
            if (r0 == r3) goto L5c
            r3 = 27
            if (r0 == r3) goto L5c
            r3 = 41
            if (r0 == r3) goto L5c
            r3 = 42
            if (r0 == r3) goto L5c
            switch(r0) {
                case 60: goto L49;
                case 61: goto L49;
                case 62: goto L49;
                default: goto L48;
            }
        L48:
            return r2
        L49:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L5c
            boolean r3 = r0 instanceof defpackage.lls
            if (r3 == 0) goto L5c
            lls r0 = (defpackage.lls) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L5c
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llt.c():boolean");
    }

    public final boolean d() {
        int i = this.a;
        return i == 37 || i == 65 || i == 67;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            llt lltVar = (llt) obj;
            if (this.a == lltVar.a && this.b == lltVar.b && this.c == lltVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + " ErrorType: " + this.a + " ErrorCode: " + this.b + " fallback: " + this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        crh.i(parcel, this.d);
        tst tstVar = this.e;
        if (!tstVar.g()) {
            crh.i(parcel, false);
        } else {
            crh.i(parcel, true);
            parcel.writeParcelable(tstVar.c(), 0);
        }
    }

    public llt(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readByte() != 0;
        this.d = crh.j(parcel);
        this.e = crh.j(parcel) ? tst.i((llv) parcel.readParcelable(llv.class.getClassLoader())) : trk.a;
    }
}
