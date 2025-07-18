package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aiy implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aiy(int i, igv igvVar, Activity activity, int i2) {
        this.d = i2;
        this.a = i;
        this.c = igvVar;
        this.b = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ahw] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws IntentSender.SendIntentException {
        bav bavVar;
        Object obj2;
        bav bavVar2;
        Object obj3;
        char c;
        int i = 2;
        boolean z = false;
        int i2 = 1;
        switch (this.d) {
            case 0:
                ?? r0 = (ahw) obj;
                chb chbVar = r0.c;
                ?? r3 = this.c;
                ?? r4 = this.b;
                if (chbVar != null) {
                    long j = chbVar.b;
                    hu.B(r0, chb.e(j), chb.a(j), r4);
                    if (r4.length() > 0) {
                        r0.f(chb.e(j), chb.e(j) + ((String) r4).length(), r3);
                    }
                } else {
                    int iE = chb.e(r0.b);
                    hu.B(r0, iE, chb.a(r0.b), r4);
                    if (r4.length() > 0) {
                        r0.f(iE, ((String) r4).length() + iE, r3);
                    }
                }
                int i3 = this.a;
                int iL = ykn.l(i3 > 0 ? (r3 + i3) - 1 : (chb.e(r0.b) + i3) - ((String) r4).length(), 0, r0.a());
                r0.g(ccf.N(iL, iL));
                return ygi.a;
            case 1:
                bwi bwiVar = (bwi) obj;
                si siVar = (si) this.b;
                int iC = siVar.a.c();
                if (iC < 0) {
                    iC = 0;
                }
                int i4 = this.a;
                if (iC > i4) {
                    iC = i4;
                }
                boolean z2 = siVar.b;
                int i5 = -iC;
                bwiVar.v(new ym(this.c, true != z2 ? i5 : 0, true != z2 ? 0 : i5, i2));
                return ygi.a;
            case 2:
                bav bavVar3 = (bav) obj;
                Object obj4 = this.c;
                bcr bcrVar = (bcr) obj4;
                int i6 = bcrVar.e;
                int i7 = this.a;
                if (i6 == i7) {
                    Object obj5 = this.b;
                    if (yks.e(obj5, bcrVar.f) && (bavVar3 instanceof baz)) {
                        jz jzVar = (jz) obj5;
                        long[] jArr = jzVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j2 = jArr[i8];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = (~(i8 - length)) >>> 31;
                                    ?? r13 = z;
                                    while (true) {
                                        int i10 = 8 - i9;
                                        if (r13 < i10) {
                                            if ((255 & j2) < 128) {
                                                int i11 = (i8 << 3) + r13;
                                                Object obj6 = jzVar.b[i11];
                                                c = '\b';
                                                if (jzVar.c[i11] != i7) {
                                                    baz bazVar = (baz) bavVar3;
                                                    bavVar2 = bavVar3;
                                                    ki kiVar = bazVar.j;
                                                    bgc.c(kiVar, obj6, obj4);
                                                    obj3 = obj4;
                                                    if (obj6 instanceof bbh) {
                                                        bbh bbhVar = (bbh) obj6;
                                                        if (!ki.e(kiVar, bbhVar)) {
                                                            bgc.b(bazVar.k, bbhVar);
                                                        }
                                                        ki kiVar2 = bcrVar.g;
                                                        if (kiVar2 != null) {
                                                            kiVar2.g(obj6);
                                                        }
                                                    }
                                                    jzVar.f(i11);
                                                } else {
                                                    bavVar2 = bavVar3;
                                                    obj3 = obj4;
                                                }
                                            } else {
                                                bavVar2 = bavVar3;
                                                obj3 = obj4;
                                                c = '\b';
                                            }
                                            j2 >>= c;
                                            bavVar3 = bavVar2;
                                            obj4 = obj3;
                                            r13++;
                                        } else {
                                            bavVar = bavVar3;
                                            obj2 = obj4;
                                            if (i10 == 8) {
                                            }
                                        }
                                    }
                                } else {
                                    bavVar = bavVar3;
                                    obj2 = obj4;
                                }
                                if (i8 != length) {
                                    i8++;
                                    bavVar3 = bavVar;
                                    obj4 = obj2;
                                    z = false;
                                }
                            }
                        }
                    }
                }
                return ygi.a;
            case 3:
                return fse.t((String) this.b, (String) this.c, this.a, (gic) obj);
            case 4:
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ghi ghiVarA = gicVar.a((String) this.b);
                int i12 = this.a;
                try {
                    ghiVarA.i(1, (String) this.c);
                    ghiVarA.g(2, i12);
                    return ghiVarA.l() ? new guj(ghiVarA.d(gez.J(ghiVarA, "work_spec_id")), (int) ghiVarA.b(gez.J(ghiVarA, "generation")), (int) ghiVarA.b(gez.J(ghiVarA, "system_id"))) : null;
                } finally {
                }
            case 5:
                gic gicVar2 = (gic) obj;
                gicVar2.getClass();
                ghi ghiVarA2 = gicVar2.a((String) this.b);
                Object obj7 = this.c;
                try {
                    ghiVarA2.g(1, this.a);
                    ghiVarA2.i(2, (String) obj7);
                    ghiVarA2.l();
                    ghiVarA2.close();
                    return ygi.a;
                } finally {
                }
            case 6:
                return fse.t((String) this.b, (String) this.c, this.a, (gic) obj);
            case 7:
                int i13 = this.a;
                tei teiVar = (tei) obj;
                if (teiVar.b(i13)) {
                    krd.e("\n            App update available, \n            version: " + teiVar.a + ", \n            priority: " + teiVar.e + ",\n            clientVersionStalenessDays: " + teiVar.d + "\n          ");
                    krd.e(a.cg(i13 != 0 ? "Immediate" : "Flexible", "Showing ", " prompt"));
                    int i14 = i13 != 0 ? 1011 : 1010;
                    Object obj8 = this.b;
                    tej tejVar = new tej(i13);
                    if (teiVar != null && teiVar.a(tejVar) != null && !teiVar.h) {
                        teiVar.h = true;
                        ((Activity) obj8).startIntentSenderForResult(teiVar.a(tejVar).getIntentSender(), i14, null, 0, 0, 0, null);
                    }
                    ((igv) this.c).d.e(new abs(i13, i));
                }
                return ygi.a;
            case 8:
                ghi ghiVarA3 = ((gic) obj).a("\n      SELECT Metadata.search_suggestion_component FROM `media_library_item` Item JOIN `media_library_item_metadata` Metadata ON Item.account_name = Metadata.account_name  AND Item.play_id = Metadata.play_id WHERE Item.account_name = ? AND Item.title LIKE '%' || ? || '%' LIMIT ?\n    ");
                int i15 = this.a;
                Object obj9 = this.c;
                try {
                    ghiVarA3.i(1, (String) this.b);
                    ghiVarA3.i(2, (String) obj9);
                    ghiVarA3.g(3, i15);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA3.l()) {
                        arrayList.add(ihz.f(ghiVarA3.k(0) ? null : ghiVarA3.m(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 9:
                ghi ghiVarA4 = ((gic) obj).a("\n      SELECT Metadata.media_library_item_metadata \n      FROM `media_library_item` Item JOIN `media_library_item_metadata` Metadata \n      ON Item.account_name = Metadata.account_name \n      AND Item.play_id = Metadata.play_id \n      WHERE Item.account_name = ? \n      AND Item.title LIKE '%' || ? || '%' LIMIT ?\n    ");
                int i16 = this.a;
                Object obj10 = this.c;
                try {
                    ghiVarA4.i(1, (String) this.b);
                    ghiVarA4.i(2, (String) obj10);
                    ghiVarA4.g(3, i16);
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA4.l()) {
                        arrayList2.add(ipc.v(ghiVarA4.k(0) ? null : ghiVarA4.m(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 10:
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                yy yyVar = jww.a;
                Object obj11 = this.c;
                obj11.getClass();
                Object obj12 = this.b;
                obj12.getClass();
                String string = ((Context) obj12).getString(R.string.content_description_story_page, Integer.valueOf(((bdn) obj11).e() + 1), Integer.valueOf(this.a));
                string.getClass();
                cfk.g(cfcVar, string);
                return ygi.a;
            case 11:
                if (Float.intBitsToFloat((int) (((bmx) obj).a >> 32)) < this.a * 0.4f) {
                    this.b.a();
                } else {
                    this.c.a();
                }
                return ygi.a;
            case 12:
                ghi ghiVarA5 = ((gic) obj).a("SELECT EXISTS(SELECT * FROM watchlist WHERE account_name = ? AND asset_id = ? AND asset_type = ? AND asset_state != ?)");
                int i17 = this.a;
                Object obj13 = this.c;
                try {
                    ghiVarA5.i(1, (String) this.b);
                    ghiVarA5.i(2, (String) obj13);
                    ghiVarA5.g(3, i17);
                    ghiVarA5.g(4, 3L);
                    if (ghiVarA5.l() && ((int) ghiVarA5.b(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                }
            default:
                ghi ghiVarA6 = ((gic) obj).a("DELETE FROM watchlist WHERE account_name = ? AND asset_id = ? AND asset_type = ?");
                int i18 = this.a;
                Object obj14 = this.c;
                try {
                    ghiVarA6.i(1, (String) this.b);
                    ghiVarA6.i(2, (String) obj14);
                    ghiVarA6.g(3, i18);
                    ghiVarA6.l();
                    return ygi.a;
                } finally {
                }
        }
    }

    public /* synthetic */ aiy(int i, String str, int i2) {
        this.d = i2;
        this.b = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.a = i;
        this.c = str;
    }

    public /* synthetic */ aiy(int i, yjk yjkVar, yjk yjkVar2, int i2) {
        this.d = i2;
        this.a = i;
        this.b = yjkVar;
        this.c = yjkVar2;
    }

    public /* synthetic */ aiy(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ aiy(String str, int i, int i2) {
        this.d = i2;
        this.b = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ aiy(String str, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.b = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ aiy(String str, int i, int i2, char[] cArr) {
        this.d = i2;
        this.b = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ aiy(String str, Object obj, int i, int i2) {
        this.d = i2;
        this.b = str;
        this.c = obj;
        this.a = i;
    }

    public /* synthetic */ aiy(si siVar, int i, bwj bwjVar, int i2) {
        this.d = i2;
        this.b = siVar;
        this.a = i;
        this.c = bwjVar;
    }
}
