package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Pair;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lik implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lik(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v19, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v52, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ljg] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, san] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IOException, IllegalArgumentException {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        switch (this.c) {
            case 0:
                ((lil) this.a).a.set(false);
                this.b.run();
                return;
            case 1:
                lha lhaVar = (lha) this.b;
                ksn ksnVar = (ksn) lhaVar.j.a.g();
                lgv lgvVar = lhaVar.j;
                String str = lgvVar.b;
                String str2 = lgvVar.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("streaming_pssh_data_key", str2);
                dyz dyzVar = (dyz) this.a;
                contentValues.put("streaming_pssh_data", dyzVar.d);
                contentValues.put("streaming_mimetype", dyzVar.c);
                lyz lyzVar = lhaVar.k;
                SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                try {
                    sQLiteDatabaseA.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{ksnVar.a, str});
                    lyzVar.e(sQLiteDatabaseA, true);
                    return;
                } catch (Throwable th) {
                    lyzVar.e(sQLiteDatabaseA, false);
                    throw th;
                }
            case 2:
                isy isyVar = (isy) this.a;
                Object obj = isyVar.a;
                ?? r2 = (ljg) this.b;
                r2.g((ljd) obj);
                r2.h(isyVar.d);
                r2.e(isyVar.b);
                r2.f(isyVar.c);
                return;
            case 3:
                break;
            case 4:
                ((lkm) this.a).B.y((llt) this.b);
                return;
            case 5:
                lkm lkmVar = (lkm) this.b;
                mjo.e(this.a, new iei(new lbj(lkmVar.D.a, 12), Pair.create(lkmVar.d, Integer.valueOf(lkmVar.y))), lkmVar.e);
                return;
            case 6:
                ?? r0 = this.a;
                lkm lkmVar2 = (lkm) this.b;
                mjo.e(r0, lkmVar2.c, lkmVar2.e);
                return;
            case 7:
                ((lli) this.a).h.y((llt) this.b);
                return;
            case 8:
                ((llm) this.a).t.y((llt) this.b);
                return;
            case 9:
                this.a.c(((llm) this.b).k);
                return;
            case 10:
                ieg iegVar = (ieg) ((lmy) this.a).k.b(this.b);
                if (iegVar.m()) {
                    krd.e("Avod watchevent upload complete");
                    return;
                } else {
                    krd.c("Failed uploading avod watchevent with failure ".concat(String.valueOf(String.valueOf(iegVar.i()))));
                    return;
                }
            case 11:
                lny lnyVar = (lny) this.a;
                ieg iegVarE = ((ieg) lnyVar.g.b(this.b)).e(new kro(17));
                if (iegVarE.m()) {
                    for (Map.Entry entry : ((Map) iegVarE.g()).entrySet()) {
                        lnyVar.b.put((String) entry.getKey(), ((kyr) entry.getValue()).a);
                        lnyVar.c.put((String) entry.getKey(), ((kyr) entry.getValue()).b);
                    }
                    return;
                }
                return;
            case 12:
                may mayVar = (may) this.a;
                if (!mfm.b(mayVar.b)) {
                    this.b.run();
                }
                mayVar.a();
                return;
            case 13:
                if (mfm.b((mfm) this.b)) {
                    return;
                }
                ((mcn) this.a).run();
                return;
            case 14:
                Object obj2 = this.a;
                ?? r22 = this.b;
                try {
                    try {
                        ((OutputStream) r22).write(((mee) obj2).b, 0, ((mee) obj2).c);
                    } catch (IOException e) {
                        krd.g("Exception writing to pipe", e);
                    }
                    try {
                        r22 = (OutputStream) r22;
                        r22.close();
                        return;
                    } catch (IOException e2) {
                        krd.g("Exception closing pipe", e2);
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        ((OutputStream) r22).close();
                    } catch (IOException e3) {
                        krd.g("Exception closing pipe", e3);
                    }
                    throw th2;
                }
            case 15:
                Process.setThreadPriority(((rna) this.a).a);
                this.b.run();
                return;
            case 16:
                try {
                    this.a.b(this.b);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                mqv mqvVar = (mqv) this.a;
                this.b.f(mqvVar.e).e();
                mqvVar.D(true);
                return;
            case 18:
                mqv mqvVar2 = (mqv) this.a;
                this.b.f(mqvVar2.f).e();
                mqvVar2.C(true);
                return;
            case 19:
                kff.s((View) this.a, new mzr((String) ((mzp) this.b).d.c()));
                return;
            default:
                nrw nrwVar = (nrw) this.b;
                njz njzVar = nrwVar.d;
                nla nlaVar = ((nkz) this.a).a;
                if (!nrv.i(njzVar, nlaVar.h)) {
                    nlaVar.h = njzVar;
                    nlaVar.v.J(nlaVar.h);
                }
                double d = nrwVar.a;
                if (Double.isNaN(d) || Math.abs(d - nlaVar.j) <= 1.0E-7d) {
                    z = false;
                } else {
                    nlaVar.j = d;
                    z = true;
                }
                boolean z4 = nrwVar.b;
                if (z4 != nlaVar.k) {
                    nlaVar.k = z4;
                    z = true;
                }
                nsf.e();
                jys jysVar = nlaVar.v;
                if (jysVar != null && (z || nlaVar.c)) {
                    jysVar.M();
                }
                Double.isNaN(nrwVar.g);
                int i2 = nrwVar.c;
                if (i2 != nlaVar.l) {
                    nlaVar.l = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                nsf.e();
                if (jysVar != null && (z2 || nlaVar.c)) {
                    jysVar.H(nlaVar.l);
                }
                int i3 = nrwVar.e;
                if (i3 != nlaVar.m) {
                    nlaVar.m = i3;
                } else {
                    z3 = false;
                }
                nsf.e();
                if (jysVar != null && (z3 || nlaVar.c)) {
                    jysVar.L(nlaVar.m);
                }
                if (!nrv.i(nlaVar.n, nrwVar.f)) {
                    nlaVar.n = nrwVar.f;
                }
                nlaVar.c = false;
                return;
        }
        while (true) {
            ?? r02 = this.b;
            if (i >= r02.size()) {
                return;
            }
            ((ljg) this.a).b((lje) r02.get(i));
            i++;
        }
    }

    public /* synthetic */ lik(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
