package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aqy {
    public static final Object a = new Object();
    public static volatile aqy b;
    public final ReadWriteLock c;
    public final Set d;
    public int e;
    public final Handler f;
    public final aqr g;
    final aqw h;
    public final boolean i;
    public final aqt j;

    public aqy(aqs aqsVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.e = 3;
        this.i = aqsVar.b;
        this.h = aqsVar.a;
        this.j = aqsVar.c;
        this.f = new Handler(Looper.getMainLooper());
        this.d = new wg(0);
        aqr aqrVar = new aqr(this);
        this.g = aqrVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    aqq aqqVar = new aqq(aqrVar);
                    aqw aqwVar = aqrVar.c.h;
                    synchronized (((ari) aqwVar).a) {
                        if (((ari) aqwVar).b == null) {
                            ((ari) aqwVar).c = new HandlerThread("emojiCompat", 10);
                            ((ari) aqwVar).c.start();
                            ((ari) aqwVar).b = new Handler(((ari) aqwVar).c.getLooper());
                        }
                        ((ari) aqwVar).b.post(new arf((ari) aqwVar, aqqVar));
                    }
                } catch (Throwable unused) {
                    aqrVar.c.g();
                }
            }
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public static aqy b() {
        aqy aqyVar;
        synchronized (a) {
            afk.b(b != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aqyVar = b;
        }
        return aqyVar;
    }

    public final int a() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00f4
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[Catch: all -> 0x01ec, TryCatch #0 {all -> 0x01ec, blocks: (B:31:0x0075, B:34:0x007a, B:36:0x007e, B:38:0x008d, B:41:0x0098, B:43:0x00a2, B:47:0x00a8, B:49:0x00b4, B:50:0x00b7, B:52:0x00c6, B:58:0x00d5, B:59:0x00e3, B:63:0x00f8, B:66:0x0105, B:88:0x0158, B:93:0x0162, B:96:0x016e, B:97:0x0173, B:98:0x017e, B:100:0x0185, B:101:0x018b, B:103:0x0196, B:68:0x010a, B:70:0x0114, B:73:0x0124, B:74:0x0128, B:77:0x0130, B:79:0x0136, B:81:0x013b, B:83:0x0141, B:84:0x0149, B:85:0x014d, B:87:0x0154, B:105:0x019d, B:107:0x01a2, B:109:0x01a8, B:111:0x01ad, B:115:0x01b7, B:118:0x01c3, B:119:0x01c9, B:39:0x0093), top: B:135:0x0075 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [arc] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence c(java.lang.CharSequence r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqy.c(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    public final void d(aqu aquVar) {
        afk.e(aquVar, "initCallback cannot be null");
        this.c.writeLock().lock();
        try {
            int i = this.e;
            if (i == 1 || i == 2) {
                Handler handler = this.f;
                afk.e(aquVar, "initCallback cannot be null");
                handler.post(new aqv(Arrays.asList(aquVar), i));
            } else {
                this.d.add(aquVar);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final boolean e() {
        return a() == 1;
    }

    public final CharSequence f(CharSequence charSequence, int i) {
        return c(charSequence, 0, i, Integer.MAX_VALUE, 0);
    }

    final void g() {
        ArrayList arrayList = new ArrayList();
        this.c.writeLock().lock();
        try {
            this.e = 2;
            Set set = this.d;
            arrayList.addAll(set);
            set.clear();
            this.c.writeLock().unlock();
            this.f.post(new aqv(arrayList, this.e));
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }
}
