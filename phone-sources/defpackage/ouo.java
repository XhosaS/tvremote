package defpackage;

import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouo implements oum {
    static final /* synthetic */ ymp[] a;
    public static final /* synthetic */ int b = 0;
    private static final tui c;
    private final tst d;
    private final tst e;
    private final tst f;
    private final tst g;
    private final ylr h = new ylo();
    private final yjz i = new dsc(10);
    private final yjz j = new dsc(11);

    static {
        ykv ykvVar = new ykv(ouo.class, "displaySupportsHdr", "getDisplaySupportsHdr()Z", 0);
        int i = ylg.a;
        a = new ymp[]{ykvVar};
        c = tui.l("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl");
    }

    public ouo(tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4) {
        this.d = tstVar;
        this.e = tstVar2;
        this.f = tstVar3;
        this.g = tstVar4;
    }

    private final enp b(vex vexVar, Map map) {
        Iterable<vft> iterable;
        ArrayList<vft> arrayList;
        Iterator it;
        String str;
        boolean z;
        boolean z2;
        Iterator it2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        boolean z3;
        ArrayList arrayList2;
        String str2;
        vew vewVarB = vew.b(vexVar.d);
        if (vewVarB == null) {
            vewVarB = vew.UNRECOGNIZED;
        }
        vewVarB.getClass();
        int iOrdinal = vewVarB.ordinal();
        int i = -1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2;
            } else if (iOrdinal == 2) {
                i = 1;
            } else if (iOrdinal == 3) {
                i = 4;
            } else if (iOrdinal != 4) {
                ((tug) c.g().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoTrackType", 446, "DashManifestConverterImpl.kt")).v("Unknown adaptation set content type: %s", vewVarB);
            } else {
                i = 3;
            }
        }
        if (i == 1) {
            int i2 = i;
            if (((Boolean) this.f.e(false)).booleanValue()) {
                iterable = vexVar.f;
                iterable.getClass();
            } else {
                vun vunVar = vexVar.f;
                vunVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : vunVar) {
                    vft vftVar = (vft) obj;
                    boolean zE = yks.e(vftVar.i, "dtse");
                    if (zE) {
                        ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoAdaptationSet", 193, "DashManifestConverterImpl.kt")).B("Filtering out DTS-HD representation %s with codec: %s", vftVar.b, vftVar.i);
                    }
                    if (!zE) {
                        arrayList3.add(obj);
                    }
                }
                iterable = arrayList3;
            }
            String str3 = vexVar.b;
            str3.getClass();
            long jE = e(str3);
            ArrayList arrayList4 = new ArrayList(yfm.z(iterable, 10));
            for (vft vftVar2 : iterable) {
                vftVar2.getClass();
                arrayList4.add(c(vftVar2, vexVar, map));
            }
            vun<vfc> vunVar2 = vexVar.i;
            vunVar2.getClass();
            ArrayList arrayList5 = new ArrayList(yfm.z(vunVar2, 10));
            for (vfc vfcVar : vunVar2) {
                vfcVar.getClass();
                arrayList5.add(d(vfcVar));
            }
            yhb yhbVar = yhb.a;
            return new enp(jE, i2, arrayList4, arrayList5, yhbVar, yhbVar);
        }
        if (i != 2) {
            if (i != 4) {
                String str4 = vexVar.b;
                str4.getClass();
                long jE2 = e(str4);
                yhb yhbVar2 = yhb.a;
                return new enp(jE2, i, yhbVar2, yhbVar2, yhbVar2, yhbVar2);
            }
            int i3 = i;
            String str5 = vexVar.b;
            str5.getClass();
            long jE3 = e(str5);
            vun<vft> vunVar3 = vexVar.f;
            vunVar3.getClass();
            ArrayList arrayList6 = new ArrayList(yfm.z(vunVar3, 10));
            for (vft vftVar3 : vunVar3) {
                vftVar3.getClass();
                vew vewVarB2 = vew.b(vexVar.d);
                if (vewVarB2 == null) {
                    vewVarB2 = vew.UNRECOGNIZED;
                }
                if (vewVarB2 != vew.IMAGE) {
                    throw new IllegalStateException("Check failed.");
                }
                dzd dzdVar = new dzd();
                dzdVar.a = vftVar3.b;
                int i4 = vftVar3.d;
                dzdVar.h = i4;
                dzdVar.i = i4;
                dzdVar.t = vftVar3.f;
                dzdVar.u = vftVar3.g;
                dzdVar.a("image/jpeg");
                dzdVar.d("image/jpeg");
                vun<vfc> vunVar4 = vftVar3.p;
                vunVar4.getClass();
                for (vfc vfcVar2 : vunVar4) {
                    if (yks.e(vfcVar2.b, "http://dashif.org/guidelines/thumbnail_tile")) {
                        if (vfcVar2 == null || (str2 = vfcVar2.c) == null) {
                            arrayList2 = null;
                        } else {
                            List listAa = ylh.aa(str2, new String[]{"x"});
                            arrayList2 = new ArrayList(yfm.z(listAa, 10));
                            Iterator it3 = listAa.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it3.next(), 10)));
                            }
                        }
                        if (arrayList2 != null) {
                            dzdVar.L = ((Number) yfm.S(arrayList2)).intValue();
                            dzdVar.M = ((Number) yfm.W(arrayList2)).intValue();
                        }
                        dze dzeVar = new dze(dzdVar);
                        enw enwVar = new enw(null, 0L, 0L);
                        vfv vfvVar = vftVar3.k;
                        if (vfvVar == null) {
                            vfvVar = vfv.a;
                        }
                        cvi cviVarV = cvi.v(vfvVar.b);
                        enq enqVar = new enq("");
                        vfv vfvVar2 = vftVar3.k;
                        long j = (vfvVar2 == null ? vfv.a : vfvVar2).d;
                        if (vfvVar2 == null) {
                            vfvVar2 = vfv.a;
                        }
                        eoc eocVar = new eoc(enwVar, j, 0L, 1L, -1L, vfvVar2.c, null, -9223372036854775807L, cviVarV, cviVarV, 0L, 0L);
                        String str6 = vftVar3.b;
                        str6.getClass();
                        long jE4 = e(str6);
                        List listP = yfm.p(enqVar);
                        vun<vfc> vunVar5 = vftVar3.p;
                        vunVar5.getClass();
                        ArrayList arrayList7 = new ArrayList(yfm.z(vunVar5, 10));
                        for (vfc vfcVar3 : vunVar5) {
                            vfcVar3.getClass();
                            arrayList7.add(d(vfcVar3));
                        }
                        vun<vfc> vunVar6 = vftVar3.m;
                        vunVar6.getClass();
                        ArrayList arrayList8 = new ArrayList(yfm.z(vunVar6, 10));
                        for (vfc vfcVar4 : vunVar6) {
                            vfcVar4.getClass();
                            arrayList8.add(d(vfcVar4));
                        }
                        arrayList6.add(new enx(jE4, dzeVar, listP, eocVar, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            yhb yhbVar3 = yhb.a;
            return new enp(jE3, i3, arrayList6, yhbVar3, yhbVar3, yhbVar3);
        }
        int i5 = i;
        ylr ylrVar = this.h;
        ymp ympVar = a[0];
        ympVar.getClass();
        Object obj2 = ((ylo) ylrVar).a;
        if (obj2 == null) {
            throw new IllegalStateException("Property " + ympVar.c() + " should be initialized before get.");
        }
        if (((Boolean) obj2).booleanValue() && ((Boolean) this.e.e(false)).booleanValue()) {
            vun vunVar7 = vexVar.f;
            vunVar7.getClass();
            arrayList = new ArrayList();
            Iterator it4 = vunVar7.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                vft vftVar4 = (vft) next;
                vftVar4.getClass();
                vun vunVar8 = vexVar.g;
                vunVar8.getClass();
                boolean zIsEmpty = vunVar8.isEmpty();
                boolean z4 = !zIsEmpty;
                try {
                    str = vftVar4.i;
                    str.getClass();
                    it = it4;
                } catch (etb unused) {
                    it = it4;
                }
                try {
                    List listD = ete.d(ylh.ac(str, "avc1") ? "video/avc" : ylh.ac(str, "hvc1") ? "video/hevc" : ylh.ac(str, "vp9") ? "video/x-vnd.on2.vp9" : ylh.ac(str, "dvhe") ? "video/dolby-vision" : "video/x-unknown", z4, false);
                    listD.getClass();
                    String str7 = vftVar4.i;
                    str7.getClass();
                    if (qtl.ay(str7)) {
                        boolean zIsEmpty2 = listD.isEmpty();
                        boolean z5 = !zIsEmpty2;
                        if (zIsEmpty2) {
                            z3 = z5;
                            ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "canBeDecoded", 372, "DashManifestConverterImpl.kt")).E("%s SDR representation %s with codec: %s can not be decoded.", !zIsEmpty ? "Encrypted" : "Clear", vftVar4.b, vftVar4.i);
                        } else {
                            z3 = z5;
                        }
                        z2 = z3;
                    } else {
                        String str8 = vftVar4.i;
                        str8.getClass();
                        yjv kilVar = ylh.ac(str8, "vp9") ? new kil(19) : ylh.ac(str8, "dvhe") ? new kil(20) : ylh.ac(str8, "hvc1") ? new oun(1) : new oun(0);
                        Iterator it5 = listD.iterator();
                        boolean z6 = zIsEmpty;
                        while (it5.hasNext()) {
                            ess essVar = (ess) it5.next();
                            if (!z6) {
                                if (!essVar.h) {
                                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = essVar.i();
                                    codecProfileLevelArrI.getClass();
                                    int length = codecProfileLevelArrI.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= length) {
                                            it2 = it5;
                                            codecProfileLevel = null;
                                            break;
                                        }
                                        it2 = it5;
                                        codecProfileLevel = codecProfileLevelArrI[i6];
                                        codecProfileLevel.getClass();
                                        if (((Boolean) kilVar.a(codecProfileLevel)).booleanValue()) {
                                            break;
                                        }
                                        i6++;
                                        it5 = it2;
                                    }
                                    if (codecProfileLevel != null) {
                                        it5 = it2;
                                    } else {
                                        it5 = it2;
                                    }
                                }
                                z6 = false;
                            }
                            z6 = true;
                        }
                        if (z6) {
                            z = z6;
                        } else {
                            z = z6;
                            ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "canBeDecoded", 393, "DashManifestConverterImpl.kt")).E("%s HDR representation %s with codec: %s can not be hardware decoded.", !zIsEmpty ? "Encrypted" : "Clear", vftVar4.b, vftVar4.i);
                        }
                        z2 = z;
                    }
                } catch (etb unused2) {
                    ((tug) c.g().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "canBeDecoded", 405, "DashManifestConverterImpl.kt")).E("Failed to get decoder info for %s HDR representation %s with codec: %s", true != z4 ? "clear" : "encrypted", vftVar4.b, vftVar4.i);
                    ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoAdaptationSet", 159, "DashManifestConverterImpl.kt")).B("Filtering out representation %s with codec: %s", vftVar4.b, vftVar4.i);
                    it4 = it;
                }
                if (z2) {
                    arrayList.add(next);
                    it4 = it;
                } else {
                    ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoAdaptationSet", 159, "DashManifestConverterImpl.kt")).B("Filtering out representation %s with codec: %s", vftVar4.b, vftVar4.i);
                    it4 = it;
                }
            }
        } else {
            vun vunVar9 = vexVar.f;
            vunVar9.getClass();
            arrayList = new ArrayList();
            for (Object obj3 : vunVar9) {
                vft vftVar5 = (vft) obj3;
                String str9 = vftVar5.i;
                str9.getClass();
                if (qtl.ay(str9)) {
                    arrayList.add(obj3);
                } else {
                    ((tug) c.b().j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoAdaptationSet", 169, "DashManifestConverterImpl.kt")).B("Filtering out HDR representation %s with codec: %s", vftVar5.b, vftVar5.i);
                }
            }
        }
        String str10 = vexVar.b;
        str10.getClass();
        long jE5 = e(str10);
        ArrayList arrayList9 = new ArrayList(yfm.z(arrayList, 10));
        for (vft vftVar6 : arrayList) {
            vftVar6.getClass();
            arrayList9.add(c(vftVar6, vexVar, map));
        }
        vun<vfc> vunVar10 = vexVar.i;
        vunVar10.getClass();
        ArrayList arrayList10 = new ArrayList(yfm.z(vunVar10, 10));
        for (vfc vfcVar5 : vunVar10) {
            vfcVar5.getClass();
            arrayList10.add(d(vfcVar5));
        }
        yhb yhbVar4 = yhb.a;
        return new enp(jE5, i5, arrayList9, arrayList10, yhbVar4, yhbVar4);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.eny c(defpackage.vft r32, defpackage.vex r33, java.util.Map r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouo.c(vft, vex, java.util.Map):eny");
    }

    private static final enu d(vfc vfcVar) {
        return new enu(vfcVar.b, vfcVar.c, null);
    }

    private static final long e(String str) {
        try {
            double d = 0.0d;
            int i = 0;
            for (Object obj : yfm.ah(ylh.aa(str, new String[]{"-"}))) {
                int i2 = i + 1;
                if (i < 0) {
                    yfm.w();
                }
                d += Double.parseDouble((String) obj) * Math.pow(100.0d, i);
                i = i2;
            }
            return (long) d;
        } catch (NumberFormatException e) {
            ((tug) ((tug) c.f()).i(e).j("com/google/android/libraries/googletv/player/kinetoscope/data/DashManifestConverterImpl", "toExoId", 513, "DashManifestConverterImpl.kt")).v("Error parsing adaptation set ID %s", str);
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.oum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enr a(defpackage.vfg r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 2340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouo.a(vfg, boolean):enr");
    }
}
