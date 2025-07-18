package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luq implements idf {
    public final Object a;
    public final Object b;
    public final Object c;
    private final /* synthetic */ int d;

    public luq(iea ieaVar, lge lgeVar, idf idfVar, int i) {
        this.d = i;
        this.a = ieaVar;
        this.b = lgeVar;
        this.c = idfVar;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [idf, java.lang.Object] */
    private final ieg a(mai maiVar, String str) {
        StringBuilder sb = new StringBuilder("videoid=");
        sb.append(Uri.encode(maiVar.a));
        sb.append("&oauth=");
        sb.append(Uri.encode(str));
        sb.append("&keyrequests=");
        String[] strArr = maiVar.b;
        sb.append(Uri.encode(strArr[0]));
        for (int i = 1; i < strArr.length; i++) {
            sb.append("|");
            sb.append(Uri.encode(strArr[i]));
        }
        if (maiVar.c) {
            sb.append("&pinned=true");
        }
        byte[] bytes = sb.toString().getBytes();
        String string = ((Uri) this.c).toString();
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        mfp mfpVar = new mfp("POST", string, bytes, map);
        mfpVar.b("Authorization", "Bearer ".concat(str));
        return (ieg) this.a.b(mfpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ldv] */
    private final String c(ksn ksnVar) {
        return this.b.j(ieg.f(ksnVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lge] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, lge] */
    /* JADX WARN: Type inference failed for: r2v12, types: [idf] */
    /* JADX WARN: Type inference failed for: r2v18, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lge] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        String str;
        ieg iegVarF;
        int i = this.d;
        if (i == 0) {
            String str2 = (String) obj;
            ieg iegVarG = ((ldy) this.a).a();
            return iegVarG.k() ? Collections.EMPTY_LIST : FluentIterable.from(this.b.b((ksn) iegVarG.g(), str2)).transform(new ldl(this, 14)).toList();
        }
        int i2 = 0;
        if (i == 1) {
            lqm lqmVar = (lqm) obj;
            ksn ksnVar = lqmVar.b;
            ksy ksyVar = lqmVar.a;
            ImmutableList immutableListA = this.c.a(ksnVar, ksyVar);
            if (immutableListA.isEmpty()) {
                krd.c("Empty purchaseId in PreorderCancel.");
                str = ksyVar.c;
            } else {
                str = (String) immutableListA.get(0);
            }
            veb vebVar = veb.a;
            vtw vtwVarM = vebVar.m();
            vdn vdnVarC = ((moz) this.b).c(ksnVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            veb vebVar2 = (veb) vtwVarM.b;
            vdnVarC.getClass();
            vebVar2.c = vdnVarC;
            vebVar2.b |= 1;
            vtw vtwVarM2 = vea.a.m();
            val valVarO = kgu.o(ksyVar);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            vea veaVar = (vea) vucVar;
            valVarO.getClass();
            veaVar.c = valVarO;
            veaVar.b |= 1;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vea veaVar2 = (vea) vtwVarM2.b;
            str.getClass();
            veaVar2.d = str;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            veb vebVar3 = (veb) vtwVarM.b;
            vea veaVar3 = (vea) vtwVarM2.r();
            veaVar3.getClass();
            vebVar3.d = veaVar3;
            vebVar3.b |= 2;
            veb vebVar4 = (veb) vtwVarM.r();
            Object obj2 = this.a;
            xsq xsqVarA = vef.d;
            if (xsqVarA == null) {
                synchronized (vef.class) {
                    xsqVarA = vef.d;
                    if (xsqVarA == null) {
                        xsn xsnVarA = xsq.a();
                        xsnVarA.d = xsp.UNARY;
                        xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.commerce.CommerceService", "Cancel");
                        xsnVarA.b();
                        vtp vtpVar = yer.a;
                        xsnVarA.b = new yep(vebVar);
                        xsnVarA.c = new yep(vec.a);
                        xsqVarA = xsnVarA.a();
                        vef.d = xsqVarA;
                    }
                }
            }
            return ((lql) obj2).b(ksnVar, vebVar4, xsqVarA, new kro(19)).c(new kro(20));
        }
        if (i == 2) {
            String str3 = (String) obj;
            ieg iegVarG2 = ((ldy) this.a).a();
            return iegVarG2.k() ? Collections.EMPTY_LIST : FluentIterable.from(this.b.c((ksn) iegVarG2.g(), str3)).transform(new ldl(this, 15)).toList();
        }
        if (i == 3) {
            tju tjuVar = (tju) obj;
            String strValueOf = String.valueOf(tjuVar.g);
            mma mmaVar = (mma) this.b;
            String strConcat = strValueOf.concat(".gb");
            rin rinVarI = mmaVar.i(strConcat);
            if (rinVarI != null) {
                return ieg.f(rinVarI);
            }
            ieg iegVar = (ieg) (tjuVar.a == -1 ? this.a : this.c).b(tjuVar);
            if (iegVar.m()) {
                return ieg.f(mmaVar.j(strConcat, (Bitmap) iegVar.g()));
            }
            iegVar.p();
            return iegVar;
        }
        if (i == 4) {
            lyf lyfVar = (lyf) obj;
            ImmutableList immutableList = lyfVar.g;
            ArrayList arrayList = new ArrayList(immutableList.size());
            Iterator it = lxo.c(lyfVar.b, 5791, immutableList, lyfVar.c, ((lfx) this.b).a(lyfVar.a).c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ieg iegVar2 = (ieg) this.c.b((lxo) it.next());
                if (!iegVar2.m()) {
                    krd.d("Failed to obtain assets", iegVar2.i());
                    break;
                }
                arrayList.addAll(this.a.b((xag) iegVar2.g()));
            }
            return arrayList;
        }
        if (i != 5) {
            mai maiVar = (mai) obj;
            try {
                ksn ksnVar2 = maiVar.d;
                String strC = c(ksnVar2);
                ieg iegVarA = a(maiVar, strC);
                if (!mfr.a(iegVarA.d)) {
                    return iegVarA;
                }
                this.b.n(strC);
                return a(maiVar, c(ksnVar2));
            } catch (ldt e) {
                return ieg.b(e);
            }
        }
        File file = new File((File) this.a, (String) obj);
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        int length = (int) file.length();
                        mee meeVarA = ((mef) this.c).a(length);
                        meeVarA.a(length);
                        byte[] bArr = meeVarA.b;
                        while (i2 < length) {
                            int i3 = fileInputStream.read(bArr, i2, length - i2);
                            if (i3 < 0) {
                                throw new EOFException(a.cf(i2, "Unexpected end of file at: "));
                            }
                            i2 += i3;
                        }
                        iegVarF = ieg.f(meeVarA);
                        fileInputStream.close();
                        reentrantReadWriteLock = (ReentrantReadWriteLock) this.b;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    iegVarF = ieg.b(new FileNotFoundException());
                }
                reentrantReadWriteLock.readLock().unlock();
                return iegVarF;
            } catch (IOException e2) {
                ieg iegVarB = ieg.b(e2);
                ((ReentrantReadWriteLock) this.b).readLock().unlock();
                return iegVarB;
            }
        } catch (Throwable th3) {
            ((ReentrantReadWriteLock) this.b).readLock().unlock();
            throw th3;
        }
    }

    public luq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public luq(mma mmaVar, idf idfVar, idf idfVar2, int i) {
        this.d = i;
        this.b = mmaVar;
        this.a = idfVar;
        this.c = idfVar2;
    }

    public luq(File file, mef mefVar, int i) {
        this.d = i;
        this.a = file;
        this.c = mefVar;
        this.b = new ReentrantReadWriteLock();
    }

    public luq(ldv ldvVar, idf idfVar, Uri uri, int i) {
        this.d = i;
        this.b = ldvVar;
        this.a = idfVar;
        uri.getClass();
        this.c = uri;
    }
}
