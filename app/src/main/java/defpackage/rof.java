package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rof implements rny {
    private final agow a;

    public rof(agow agowVar) {
        this.a = agowVar;
    }

    @Override // defpackage.rny
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: roe
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.a.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.a.a();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((rod) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                zyd[] zydVarArr = (zyd[]) arrayList2.toArray(new zyd[0]);
                final zxl zxlVar = new zxl(zydVarArr);
                yyf yyfVarG = yyk.g(zydVarArr.length);
                for (int i = 0; i < zydVarArr.length; i++) {
                    yyfVarG.g(new zxk(zxlVar));
                }
                final yyk yykVarF = yyfVarG.f();
                for (final int i2 = 0; i2 < zydVarArr.length; i2++) {
                    zydVarArr[i2].d(new Runnable() { // from class: zxf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zxl zxlVar2 = zxlVar;
                            zyd[] zydVarArr2 = zxlVar2.d;
                            int i3 = i2;
                            zyd zydVar = zydVarArr2[i3];
                            zydVar.getClass();
                            zydVarArr2[i3] = null;
                            int i4 = zxlVar2.e;
                            while (true) {
                                yyk yykVar = yykVarF;
                                int i5 = ((zcg) yykVar).d;
                                if (i4 >= i5) {
                                    zxlVar2.e = i5;
                                    return;
                                }
                                int i6 = i4 + 1;
                                if (((zum) yykVar.get(i4)).eZ(zydVar)) {
                                    zxlVar2.a();
                                    zxlVar2.e = i6;
                                    return;
                                }
                                i4 = i6;
                            }
                        }
                    }, zwk.a);
                }
                zdm zdmVarListIterator = yykVarF.listIterator(0);
                while (zdmVarListIterator.hasNext()) {
                    try {
                        zze.b((zyd) zdmVarListIterator.next(), 4000 - (SystemClock.elapsedRealtime() - jElapsedRealtime), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Throwable) it2.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
