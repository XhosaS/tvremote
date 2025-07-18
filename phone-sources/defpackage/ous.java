package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ous implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ous(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        whh whhVar;
        udj udjVar;
        switch (this.a) {
            case 0:
                parcel.getClass();
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                String string2 = parcel.readString();
                return new out(string, new our(string2 != null ? string2 : "", ouq.values()[parcel.readInt()]));
            case 1:
                parcel.getClass();
                return new qpz(parcel.readString());
            case 2:
                parcel.getClass();
                parcel.readInt();
                return qql.a;
            case 3:
                parcel.getClass();
                parcel.readInt();
                return qqn.a;
            case 4:
                parcel.getClass();
                return new qxi(parcel.readString());
            case 5:
                parcel.getClass();
                return new qxm((qxl) parcel.readParcelable(qxm.class.getClassLoader()), (vrr) vrr.c.get(parcel.readInt()));
            case 6:
                parcel.getClass();
                return new qxt(parcel.readString());
            case 7:
                parcel.getClass();
                parcel.readInt();
                return qyg.a;
            case 8:
                return new rle(parcel.readInt() == 1, parcel.readParcelable(rlm.class.getClassLoader()));
            case 9:
                return new rzt(parcel.readBundle(getClass().getClassLoader()));
            case 10:
                int i = parcel.readInt();
                byte[] bArr = new byte[i];
                parcel.readByteArray(bArr);
                int i2 = parcel.readInt();
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                try {
                    vuc vucVarP = vuc.p(whh.a, bArr, 0, i, vtp.a());
                    vuc.B(vucVarP);
                    whhVar = (whh) vucVarP;
                    vuc vucVarP2 = vuc.p(udj.a, bArr2, 0, i2, vtp.a());
                    vuc.B(vucVarP2);
                    udjVar = (udj) vucVarP2;
                } catch (vuq e) {
                    ((tug) ((tug) ((tug) sbb.a.g()).i(e)).j("com/google/android/libraries/play/logging/ulex/common/play/logsystem/PlayGlobalDimensionData$1", "createFromParcel", 56, "PlayGlobalDimensionData.java")).r();
                    whhVar = whh.a;
                    udjVar = udj.a;
                }
                return new sbb(whhVar, udjVar);
            case 11:
                return new sbc(parcel.readLong());
            case 12:
                long j = parcel.readLong();
                int iB = sbf.b(parcel);
                return new sbe(sbf.j(iB, parcel), sbf.d(parcel), sbf.c(iB, parcel), j, parcel.readLong(), (sbb) parcel.readParcelable(sbb.class.getClassLoader()), parcel.readLong());
            case 13:
                long j2 = parcel.readLong();
                int iB2 = sbf.b(parcel);
                return new sbf(sbf.j(iB2, parcel), sbf.d(parcel), sbf.c(iB2, parcel), j2);
            case 14:
                return new sdo(parcel.readInt(), parcel.readInt());
            case 15:
                String string3 = parcel.readString();
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, ses.class.getClassLoader());
                ArrayList arrayList2 = new ArrayList();
                parcel.readList(arrayList2, set.class.getClassLoader());
                return new ser(string3, DesugarCollections.unmodifiableList(arrayList), ImmutableSet.copyOf((Collection) arrayList2));
            case 16:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                ArrayList arrayList3 = new ArrayList();
                parcel.readList(arrayList3, sev.class.getClassLoader());
                xwk xwkVarB = ses.b();
                xwkVarB.e(string4);
                xwkVarB.d(string5);
                xwkVarB.c(arrayList3);
                return xwkVarB.b();
            case 17:
                ArrayList arrayList4 = new ArrayList();
                parcel.readStringList(arrayList4);
                return new set(ImmutableSet.copyOf((Collection) arrayList4));
            case 18:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ArrayList arrayList5 = new ArrayList();
                parcel.readList(arrayList5, sev.class.getClassLoader());
                byte b = parcel.readByte();
                byte b2 = parcel.readByte();
                seu seuVarA = sev.a();
                seuVarA.h(string6);
                seuVarA.j(string7);
                seuVarA.c(string8);
                seuVarA.f(i3);
                seuVarA.e(i4);
                seuVarA.d(string9);
                seuVarA.k(string10);
                seuVarA.b(DesugarCollections.unmodifiableList(arrayList5));
                seuVarA.i(b != 0);
                seuVarA.g(b2 != 0);
                return seuVarA.a();
            case 19:
                return new sgu(parcel);
            default:
                return new shh(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new out[i];
            case 1:
                return new qpz[i];
            case 2:
                return new qql[i];
            case 3:
                return new qqn[i];
            case 4:
                return new qxi[i];
            case 5:
                return new qxm[i];
            case 6:
                return new qxt[i];
            case 7:
                return new qyg[i];
            case 8:
                return new rle[i];
            case 9:
                return new rzt[i];
            case 10:
                return new sbb[i];
            case 11:
                return new sbc[i];
            case 12:
                return new sbe[i];
            case 13:
                return new sbf[i];
            case 14:
                return new sdo[i];
            case 15:
                return new ser[i];
            case 16:
                return new ses[i];
            case 17:
                return new set[i];
            case 18:
                return new sev[i];
            case 19:
                return new sgu[i];
            default:
                return new shh[i];
        }
    }
}
