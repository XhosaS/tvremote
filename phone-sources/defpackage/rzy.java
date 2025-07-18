package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode;
import android.support.v7.appcompat.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzy {
    public final Object a;
    public final Object b;

    public rzy() {
        throw null;
    }

    private static final byte[] I(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static final zaf h(boolean z, rpe rpeVar) {
        tst tstVarB;
        vtw vtwVarM = zaf.a.m();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        zaf zafVar = (zaf) vucVar;
        zafVar.b |= 1;
        zafVar.c = elapsedCpuTime;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        zaf zafVar2 = (zaf) vtwVarM.b;
        zafVar2.b |= 2;
        zafVar2.d = z;
        int iActiveCount = Thread.activeCount();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        zaf zafVar3 = (zaf) vtwVarM.b;
        zafVar3.b |= 4;
        zafVar3.e = iActiveCount;
        int iMyPid = Process.myPid();
        int i = 0;
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(iMyPid));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    tstVarB = tst.h(randomAccessFile.readLine()).b(new rke(12));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                tstVarB = trk.a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (tstVarB.g()) {
                int iIntValue = ((Integer) tstVarB.c()).intValue();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zaf zafVar4 = (zaf) vtwVarM.b;
                zafVar4.b |= 16;
                zafVar4.g = iIntValue;
            }
            tst tstVar = !rpeVar.a ? trk.a : (tst) Iterables.tryFind(rpeVar.a(), new rpc(iMyPid, i)).b(new rke(7)).e(trk.a);
            if (tstVar.g()) {
                String strFlattenToString = ((ComponentName) tstVar.c()).flattenToString();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                zaf zafVar5 = (zaf) vtwVarM.b;
                strFlattenToString.getClass();
                zafVar5.b |= 32;
                zafVar5.h = strFlattenToString;
            }
            return (zaf) vtwVarM.r();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    public static final byte[] w(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            throw new IllegalArgumentException();
        }
        int i = length < 4 ? 1 : length >> 2;
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static void z() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void A(String str) {
        ((StringBuilder) this.a).append(str);
    }

    public final void B(String str) {
        ((ArrayList) this.b).add(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final sfz C() {
        return new sfz(((StringBuilder) this.a).toString(), this.b);
    }

    public final void D(String str) {
        ((StringBuilder) this.a).append(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void E(String str, Object... objArr) {
        ((StringBuilder) this.a).append(str);
        if (objArr != null) {
            ?? r0 = this.b;
            if (r0.size() + objArr.length > 999) {
                throw new IllegalArgumentException("Single SQL statements support at most 999 parameters.");
            }
            for (Object obj : objArr) {
                if (obj == null) {
                    throw new IllegalArgumentException("Bind argument can't be null for query".concat(str));
                }
                r0.add(obj.toString());
            }
        }
    }

    public final int F(aafi aafiVar) throws InterruptedException {
        z();
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        Object obj = aafiVar.c;
        sb.append((String) obj);
        sb.append(" WHERE ");
        Object obj2 = aafiVar.a;
        sb.append((String) obj2);
        tql tqlVarQ = szg.q(sb.toString());
        try {
            String str = (String) obj;
            int iDelete = ((SQLiteDatabase) this.a).delete(str, (String) obj2, (String[]) aafiVar.b);
            tqlVarQ.close();
            return iDelete;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void G(rzy rzyVar) throws InterruptedException {
        z();
        Object obj = rzyVar.a;
        tql tqlVarQ = szg.q("execSQL: ".concat((String) obj));
        try {
            ((SQLiteDatabase) this.a).execSQL((String) obj, (Object[]) rzyVar.b);
            tqlVarQ.close();
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final rzy H() {
        String string = ((StringBuilder) this.a).toString();
        ArrayList arrayList = (ArrayList) this.b;
        return new rzy(string, arrayList.toArray(new Object[arrayList.size()]));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ryq] */
    public final ryn a(String str, double d) {
        return new ryf((String) this.a, str, this.b, d);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ryq] */
    public final ryn b(String str, long j) {
        return new ryh((String) this.a, str, this.b, j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ryq] */
    public final ryn c(String str, String str2) {
        return new ryj((String) this.a, str, this.b, str2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ryq] */
    public final ryn d(String str, boolean z) {
        return new ryb((String) this.a, str, this.b, z);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ryq] */
    public final ryn e(String str, rxz rxzVar, String str2) {
        return new ryd((String) this.a, str, this.b, rxzVar, str2);
    }

    public final boolean f(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object[] objArr;
        try {
            Class<?> cls = packageManager.getClass();
            Object obj = this.b;
            Object obj2 = this.a;
            Method method = cls.getMethod((String) obj, (Class[]) obj2);
            if (((Class[]) obj2).length == 2) {
                if (((Class[]) obj2)[0] == String.class && ((Class[]) obj2)[1] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (((Class[]) obj2)[0] == String.class && ((Class[]) obj2)[1] == Integer.TYPE && ((Class[]) obj2)[2] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error e) {
            e = e;
            int i2 = rua.b;
            ((tug) ((tug) rnb.a.e()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", R.styleable.AppCompatTheme_windowFixedWidthMinor, "PackageStatsCapture.java")).E("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        } catch (NoSuchMethodException e2) {
            int i3 = rua.b;
            ((tug) ((tug) ((tug) rnb.a.b()).i(e2)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 'u', "PackageStatsCapture.java")).s("PackageStats getter not found");
            return false;
        } catch (Exception e3) {
            e = e3;
            int i22 = rua.b;
            ((tug) ((tug) rnb.a.e()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", R.styleable.AppCompatTheme_windowFixedWidthMinor, "PackageStatsCapture.java")).E("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        }
    }

    public final zaf g() {
        rpe rpeVarA = rpd.a((Context) this.b, "getAndroidProcessStats");
        return h(((aafi) this.a).v(new riu(rpeVarA, 15)), rpeVarA);
    }

    public final uhp i(rkf rkfVar, String str, int i) {
        trf trfVarD = trf.d(rkfVar.a(((riv) this.a).a(new Account(str, "com.google")), new prk(xno.a.get().a((Context) this.b)), rrx.V(i)));
        rke rkeVar = new rke(0);
        ugk ugkVar = ugk.a;
        trf trfVarE = trfVarD.a(prl.class, rkeVar, ugkVar).b(nwk.class, new pri(7), ugkVar).b(IOException.class, new pri(8), ugkVar).e(new rke(2), ugkVar);
        szg.n(trfVarE, new pjm(3), ugkVar);
        return trfVarE;
    }

    public final void j(String str, String str2) {
        p(new lke(this, str, str2, 20, (int[]) null));
    }

    public final void k(String str, String str2, String str3, String str4, boolean z) {
        p(new rip(this, str, str2, str3, str4, z, 0));
    }

    public final void l(final String str, final String str2, final int i, final String str3, final boolean z) {
        p(new Runnable() { // from class: rio
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
            @Override // java.lang.Runnable
            public final void run() {
                ((snf) ((riv) this.f.a.get()).d.get()).b(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void m(final String str, final boolean z, final boolean z2, final boolean z3, final int i, final String str2) {
        p(new Runnable() { // from class: ris
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
            @Override // java.lang.Runnable
            public final void run() {
                ((snf) ((riv) this.g.a.get()).c.get()).b(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
            }
        });
    }

    public final void n(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        p(new Runnable() { // from class: riq
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
            @Override // java.lang.Runnable
            public final void run() {
                ((snc) ((riv) this.g.a.get()).g.get()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void o(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        p(new Runnable() { // from class: rir
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ttm] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ttm] */
            @Override // java.lang.Runnable
            public final void run() {
                ((snc) ((riv) this.g.a.get()).f.get()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final void p(Runnable runnable) {
        Object obj = this.b;
        rin rinVar = (rin) obj;
        if (rinVar.a) {
            rinVar.b.schedule(new qto(runnable, obj, 17, null), 5L, TimeUnit.SECONDS).getClass();
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void q() {
        sjl.c();
        while (true) {
            ?? r0 = this.a;
            if (r0.isEmpty()) {
                return;
            } else {
                ((Runnable) r0.remove()).run();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rhv] */
    public final void r() {
        sij.x(this.b.d(), "Object was not initialized");
        rrx.ac(new qxp(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rhv] */
    public final void s(Runnable runnable) {
        sjl.c();
        this.a.add(runnable);
        if (this.b.d()) {
            q();
        }
    }

    public final rcj t(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.videos.R.layout.og_bento_card, viewGroup, false);
        viewInflate.getClass();
        CardFrameLayout cardFrameLayout = (CardFrameLayout) viewInflate;
        ConstraintLayout constraintLayout = (ConstraintLayout) cardFrameLayout.findViewById(com.google.android.videos.R.id.og_bento_ready_card_container);
        constraintLayout.getClass();
        LayoutInflater.from(constraintLayout.getContext()).inflate(com.google.android.videos.R.layout.og_bento_ready_card, constraintLayout);
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_trailing_content);
        LinearLayout linearLayout = (LinearLayout) constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_progress_content);
        FrameLayout frameLayout2 = (FrameLayout) constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_primary_button);
        FrameLayout frameLayout3 = (FrameLayout) constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_secondary_button);
        FrameLayout frameLayout4 = (FrameLayout) constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_image_container);
        cqn cqnVar = new cqn();
        cqnVar.e(constraintLayout);
        ttm ttmVarL = sij.l(new qoi(frameLayout4, 7));
        sij.l(new qoi(frameLayout4, 8));
        View viewFindViewById = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_title);
        viewFindViewById.getClass();
        cb cbVar = new cb((TextView) viewFindViewById, (byte[]) null);
        View viewFindViewById2 = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_subtitle);
        viewFindViewById2.getClass();
        cb cbVar2 = new cb((TextView) viewFindViewById2, (byte[]) null);
        View viewFindViewById3 = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_top_content);
        viewFindViewById3.getClass();
        frameLayout.getClass();
        ttm ttmVarL2 = sij.l(new evk(this.b, frameLayout, 13));
        View viewFindViewById4 = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_main_content);
        viewFindViewById4.getClass();
        View viewFindViewById5 = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_paragraph);
        viewFindViewById5.getClass();
        cb cbVar3 = new cb((TextView) viewFindViewById5, (byte[]) null);
        ttm ttmVarL3 = sij.l(new qoi(linearLayout, 9));
        linearLayout.getClass();
        ttm ttmVarL4 = sij.l(new qoi(frameLayout2, 10));
        frameLayout2.getClass();
        ttm ttmVarL5 = sij.l(new qoi(frameLayout3, 11));
        frameLayout3.getClass();
        View viewFindViewById6 = constraintLayout.findViewById(com.google.android.videos.R.id.og_bento_card_buttons_flow);
        viewFindViewById6.getClass();
        frameLayout4.getClass();
        rcu rcuVar = new rcu(constraintLayout, cqnVar, ttmVarL, cbVar, cbVar2, (ConstraintLayout) viewFindViewById3, frameLayout, ttmVarL2, viewFindViewById4, cbVar3, ttmVarL3, linearLayout, ttmVarL4, frameLayout2, ttmVarL5, frameLayout3, viewFindViewById6, frameLayout4);
        cardFrameLayout.a = rcuVar.d;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) cardFrameLayout.findViewById(com.google.android.videos.R.id.og_bento_loading_card_container);
        Object obj = this.a;
        constraintLayout2.getClass();
        LayoutInflater.from(constraintLayout2.getContext()).inflate(com.google.android.videos.R.layout.og_bento_loading_card, constraintLayout2);
        View viewFindViewById7 = constraintLayout2.findViewById(com.google.android.videos.R.id.og_bento_card_icon_placeholder);
        viewFindViewById7.getClass();
        rcp rcpVar = (rcp) obj;
        rcpVar.a((ImageView) viewFindViewById7);
        View viewFindViewById8 = constraintLayout2.findViewById(com.google.android.videos.R.id.og_bento_card_title_placeholder);
        viewFindViewById8.getClass();
        rcpVar.a((ImageView) viewFindViewById8);
        View viewFindViewById9 = constraintLayout2.findViewById(com.google.android.videos.R.id.og_bento_card_subtitle_placeholder);
        viewFindViewById9.getClass();
        rcpVar.a((ImageView) viewFindViewById9);
        return new rcj(cardFrameLayout, rcuVar, constraintLayout, constraintLayout2);
    }

    public final byte[] u(byte[] bArr) throws tij, NoSuchAlgorithmException {
        PublicKey publicKey = ((Certificate) this.b).getPublicKey();
        PublicKey publicKey2 = ((Certificate) this.a).getPublicKey();
        sip.m(bArr);
        if (!(publicKey instanceof RSAPublicKey) || !(publicKey2 instanceof RSAPublicKey)) {
            throw new tij("Polo only supports RSA public keys");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        RSAPublicKey rSAPublicKey2 = (RSAPublicKey) publicKey2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] byteArray = rSAPublicKey.getModulus().abs().toByteArray();
            byte[] byteArray2 = rSAPublicKey.getPublicExponent().abs().toByteArray();
            byte[] byteArray3 = rSAPublicKey2.getModulus().abs().toByteArray();
            byte[] byteArray4 = rSAPublicKey2.getPublicExponent().abs().toByteArray();
            byte[] bArrI = I(byteArray);
            byte[] bArrI2 = I(byteArray2);
            byte[] bArrI3 = I(byteArray3);
            byte[] bArrI4 = I(byteArray4);
            sip.m(bArrI);
            sip.m(bArrI2);
            sip.m(bArrI3);
            sip.m(bArrI4);
            sip.m(bArr);
            messageDigest.update(bArrI);
            messageDigest.update(bArrI2);
            messageDigest.update(bArrI3);
            messageDigest.update(bArrI4);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            sip.m(bArrDigest);
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            throw new tij("Could not get digest algorithm", e);
        }
    }

    public final byte[] v(int i, byte[] bArr) throws tij, NoSuchAlgorithmException {
        byte[] bArrU = u(bArr);
        sij.i(bArrU.length >= i);
        int length = bArr.length;
        byte[] bArr2 = new byte[i + length];
        System.arraycopy(bArrU, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr2, i, length);
        return bArr2;
    }

    @SafeVarargs
    public final int x(String str, String str2, String... strArr) throws InterruptedException {
        z();
        tql tqlVarQ = szg.q(a.cz(str2, str, "DELETE FROM ", " WHERE "));
        try {
            int iDelete = ((SQLiteDatabase) this.a).delete(str, str2, strArr);
            tqlVarQ.close();
            return iDelete;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long y(String str, ContentValues contentValues, int i) throws InterruptedException {
        z();
        tql tqlVarQ = szg.q("INSERT WITH ON CONFLICT ".concat(str));
        try {
            long jInsertWithOnConflict = ((SQLiteDatabase) this.a).insertWithOnConflict(str, null, contentValues, i);
            tqlVarQ.close();
            return jInsertWithOnConflict;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public rzy(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rzy(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public rzy(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public rzy(Object obj, Object obj2, short[] sArr) {
        this.b = obj;
        this.a = obj2;
    }

    public rzy(Context context) {
        this.a = new rpl();
        this.b = context;
    }

    public rzy(rhv rhvVar) {
        this.a = new ArrayDeque();
        this.b = rhvVar;
    }

    protected rzy(rzy rzyVar, int i) {
        this.a = rzyVar;
        this.b = new ulp(Object.class, i);
    }

    public rzy(byte[] bArr) {
        this.a = new Rect();
        this.b = new Rect();
    }

    public rzy(char[] cArr) {
        this.a = new StringBuilder();
        this.b = new ArrayList();
    }

    public rzy(Context context, ScheduledExecutorService scheduledExecutorService) {
        context.getClass();
        scheduledExecutorService.getClass();
        this.a = sij.l(new evk(scheduledExecutorService, context, 15));
        this.b = new rin(scheduledExecutorService);
    }

    public rzy(short[] sArr) {
        this.a = new StringBuilder();
        this.b = new ArrayList();
    }

    public rzy(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = new CancellationSignal();
    }
}
