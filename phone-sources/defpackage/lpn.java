package defpackage;

import android.support.v7.appcompat.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lpn implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ lpn(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        int i = 9;
        boolean z = false;
        int i2 = 18;
        switch (this.a) {
            case 0:
                return (Integer) ((tst) obj).c();
            case 1:
                switch ((vak) obj) {
                    case TYPE_UNSPECIFIED:
                    case UNRECOGNIZED:
                        return trk.a;
                    case MOVIE:
                        return tst.i(6);
                    case BUNDLE:
                        return tst.i(5000);
                    case SHOW:
                        return tst.i(18);
                    case SEASON:
                        return tst.i(19);
                    case EPISODE:
                        return tst.i(20);
                    case ANDROID_APP:
                        return tst.i(1);
                    case ALBUM:
                        return tst.i(2);
                    case SONG:
                        return tst.i(4);
                    case VOUCHER:
                        return tst.i(29);
                    case DISTRIBUTOR:
                        return tst.i(61);
                    case PERSON:
                        return tst.i(65);
                    case STORY:
                        return tst.i(50);
                    case BOOK:
                        return tst.i(5);
                    case TRAILER:
                        return tst.i(5001);
                    case BANNER:
                        return tst.i(70);
                    case ATV_BANNER:
                        return tst.i(Integer.valueOf(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                    case LIVE_CHANNEL:
                        return tst.i(108);
                    default:
                        throw new RuntimeException(null, null);
                }
            case 2:
                return kgu.n((ksy) obj);
            case 3:
                return (val) ((tst) obj).c();
            case 4:
                return (lqd) ((tst) obj).c();
            case 5:
                return kir.o((vcb) obj);
            case 6:
                return (kuv) ((tst) obj).c();
            case 7:
                vyb vybVar = (vyb) obj;
                vtw vtwVarM = laf.a.m();
                String str = vybVar.c;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                str.getClass();
                ((laf) vucVar).b = str;
                vun vunVar = vybVar.d;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                laf lafVar = (laf) vtwVarM.b;
                vun vunVar2 = lafVar.c;
                if (!vunVar2.c()) {
                    lafVar.c = vuc.s(vunVar2);
                }
                vsf.h(vunVar, lafVar.c);
                vul vulVar = new vul(vybVar.e, vyb.a);
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator<T> it = vulVar.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((vak) it.next()).ordinal();
                    if (iOrdinal == 1) {
                        builder.add((ImmutableList.Builder) 6);
                    } else if (iOrdinal == 3) {
                        builder.add((ImmutableList.Builder) 18);
                    }
                }
                ImmutableList immutableListBuild = builder.build();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                laf lafVar2 = (laf) vtwVarM.b;
                vuj vujVar = lafVar2.d;
                if (!vujVar.c()) {
                    lafVar2.d = vuc.q(vujVar);
                }
                vsf.h(immutableListBuild, lafVar2.d);
                ImmutableList list = FluentIterable.from(vybVar.f).transform(new lpn(8)).filter(new efc(i2)).transform(new lpn(i)).toList();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                laf lafVar3 = (laf) vtwVarM.b;
                vun vunVar3 = lafVar3.e;
                if (!vunVar3.c()) {
                    lafVar3.e = vuc.s(vunVar3);
                }
                vsf.h(list, lafVar3.e);
                return (laf) vtwVarM.r();
            case 8:
                vya vyaVar = (vya) obj;
                int iAK = a.aK(vyaVar.g);
                if (iAK == 0) {
                    iAK = 1;
                }
                int i3 = iAK - 2;
                tst tstVarI = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? trk.a : tst.i(lae.OFF) : tst.i(lae.STRICT) : tst.i(lae.MODERATE) : tst.i(lae.LIGHT);
                if (!tstVarI.g()) {
                    return trk.a;
                }
                vtw vtwVarM2 = lad.a.m();
                String str2 = vyaVar.b;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                lad ladVar = (lad) vtwVarM2.b;
                str2.getClass();
                ladVar.b = str2;
                vbi vbiVar = vyaVar.c;
                if (vbiVar == null) {
                    vbiVar = vbi.a;
                }
                String str3 = vbiVar.b;
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar2 = vtwVarM2.b;
                str3.getClass();
                ((lad) vucVar2).c = str3;
                String str4 = vyaVar.d;
                if (!vucVar2.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar3 = vtwVarM2.b;
                str4.getClass();
                ((lad) vucVar3).d = str4;
                int i4 = vyaVar.e;
                if (!vucVar3.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar4 = vtwVarM2.b;
                ((lad) vucVar4).e = i4;
                int i5 = vyaVar.f;
                if (!vucVar4.A()) {
                    vtwVarM2.u();
                }
                ((lad) vtwVarM2.b).f = i5;
                Object objC = tstVarI.c();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                ((lad) vtwVarM2.b).g = ((lae) objC).a();
                return tst.i((lad) vtwVarM2.r());
            case 9:
                return (lad) ((tst) obj).c();
            case 10:
                vza vzaVar = (vza) obj;
                int iAK2 = a.aK(vzaVar.c);
                if (iAK2 == 0) {
                    iAK2 = 1;
                }
                int i6 = iAK2 - 2;
                return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? trk.a : tst.i(new lrv(4, kir.i(vzaVar))) : tst.i(new lrv(3, kir.i(vzaVar))) : tst.i(new lrv(2, kir.i(vzaVar))) : tst.i(new lrv(1, false));
            case 11:
                return (lrv) ((tst) obj).c();
            case 12:
                vzg vzgVar = (vzg) obj;
                val valVar = vzgVar.b;
                if (valVar == null) {
                    valVar = val.a;
                }
                ksy ksyVarM = kgu.m(valVar);
                vam vamVar = vzgVar.e;
                if (vamVar == null) {
                    vamVar = vam.a;
                }
                ktz ktzVarL = kir.l(vamVar.b);
                if (ktzVarL.h + ktzVarL.i > 0 && !ksy.w(ksyVarM)) {
                    z = true;
                }
                return new lsg(ksyVarM, z);
            case 13:
                vaj vajVar = (vaj) obj;
                int i7 = vajVar.b;
                int iC = vef.c(i7);
                if (iC == 0) {
                    throw null;
                }
                int i8 = iC - 1;
                if (i8 != 5) {
                    if (i8 != 7) {
                        return trk.a;
                    }
                    return tst.i(krf.D(i7 == 9 ? (vao) vajVar.c : vao.a, kuf.a.b));
                }
                vao vaoVar = i7 == 7 ? (vao) vajVar.c : vao.a;
                val valVar2 = (vajVar.b == 7 ? (vao) vajVar.c : vao.a).b;
                if (valVar2 == null) {
                    valVar2 = val.a;
                }
                return tst.i(krf.D(vaoVar, valVar2.c));
            case 14:
                return (lav) ((tst) obj).c();
            case 15:
                vzo vzoVar = (vzo) obj;
                vtw vtwVarM3 = kzy.a.m();
                String str5 = vzoVar.b;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar5 = vtwVarM3.b;
                str5.getClass();
                ((kzy) vucVar5).b = str5;
                int iAQ = a.aQ(vzoVar.c);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i9 = iAQ - 2;
                int i10 = i9 != 1 ? i9 != 2 ? i9 != 3 ? 2 : 4 : 3 : 5;
                if (!vucVar5.A()) {
                    vtwVarM3.u();
                }
                ((kzy) vtwVarM3.b).c = a.aG(i10);
                return (kzy) vtwVarM3.r();
            case 16:
                vzn vznVar = (vzn) obj;
                vtw vtwVarM4 = kzr.a.m();
                String str6 = vznVar.c;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                kzr kzrVar = (kzr) vtwVarM4.b;
                str6.getClass();
                kzrVar.b = str6;
                boolean zContains = new vul(vznVar.f, vzn.a).contains(vzm.CHANNELS_5_1);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vuc vucVar6 = vtwVarM4.b;
                ((kzr) vucVar6).c = zContains;
                int iAs = a.as(vznVar.e);
                if (iAs == 0) {
                    iAs = 1;
                }
                int i11 = iAs - 2;
                kzp kzpVar = i11 != 1 ? i11 != 2 ? kzp.UNKNOWN_LANGUAGE_TYPE : kzp.DUBBED : kzp.ORIGINAL;
                if (!vucVar6.A()) {
                    vtwVarM4.u();
                }
                ((kzr) vtwVarM4.b).e = kzpVar.a();
                int iAK3 = a.aK(vznVar.d);
                if (iAK3 == 0) {
                    iAK3 = 1;
                }
                int i12 = iAK3 - 2;
                kzq kzqVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? kzq.UNKNOWN_TRACK_TYPE : kzq.NARRATION : kzq.PRIMARY_DESCRIPTIVE : kzq.COMMENTARY : kzq.PRIMARY;
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                ((kzr) vtwVarM4.b).d = kzqVar.a();
                return (kzr) vtwVarM4.r();
            case 17:
                return ((vaq) obj).b;
            case 18:
                vtw vtwVarM5 = laj.a.m();
                String str7 = ((vzi) obj).b;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                laj lajVar = (laj) vtwVarM5.b;
                str7.getClass();
                lajVar.b = str7;
                return (laj) vtwVarM5.r();
            case 19:
                vtw vtwVarM6 = lbo.a.m();
                String str8 = ((val) obj).c;
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                lbo lboVar = (lbo) vtwVarM6.b;
                str8.getClass();
                lboVar.b = str8;
                return (lbo) vtwVarM6.r();
            default:
                vtw vtwVarM7 = kzv.a.m();
                String str9 = ((val) obj).c;
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                kzv kzvVar = (kzv) vtwVarM7.b;
                str9.getClass();
                kzvVar.b = str9;
                return (kzv) vtwVarM7.r();
        }
    }
}
