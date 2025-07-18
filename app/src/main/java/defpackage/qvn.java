package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvn implements quz {
    public final zyh a;
    public final aehf b;

    public qvn(quy quyVar, final Context context, zyh zyhVar, aehf aehfVar, agow agowVar, final agow agowVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        quyVar.a(zyhVar, aehfVar, agowVar);
        this.a = zyhVar;
        this.b = aehfVar;
        yru.a(new yrp() { // from class: qvl
            @Override // defpackage.yrp
            public final Object eV() {
                qvn qvnVar = this.a;
                Context context2 = context;
                synchronized (qvnVar) {
                    String strB = qth.b();
                    String str = strB + ".trace";
                    File file = new File(context2.getFilesDir(), a.j(strB, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        return ypv.a;
                    }
                    File file2 = new File(file, str);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException unused) {
                    }
                    return yqt.i(file2);
                }
            }
        });
        yru.a(new yrp() { // from class: qvm
            @Override // defpackage.yrp
            public final Object eV() {
                return (qvo) agowVar2.a();
            }
        });
    }

    public final synchronized void a() {
    }

    @Override // defpackage.quz
    public final void k() {
        zxn.j(new Runnable() { // from class: qvk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, this.a);
    }
}
