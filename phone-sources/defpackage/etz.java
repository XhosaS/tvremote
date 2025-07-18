package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etz extends Handler {
    private final HandlerThread a;
    private final euo b;
    private final Handler c;
    private final ArrayList d;
    private final HashMap e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private final gag l;

    public etz(HandlerThread handlerThread, euo euoVar, gag gagVar, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = euoVar;
        this.l = gagVar;
        this.c = handler;
        this.h = 3;
        this.i = 5;
        this.g = z;
        this.d = new ArrayList();
        this.e = new HashMap();
    }

    private final int a(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((etn) arrayList.get(i)).a.a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    private static etn b(etn etnVar, int i, int i2) {
        return new etn(etnVar.a, i, etnVar.c, System.currentTimeMillis(), etnVar.e, i2, 0, etnVar.h);
    }

    private final etn c(String str, boolean z) {
        int iA = a(str);
        if (iA != -1) {
            return (etn) this.d.get(iA);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.a(str);
        } catch (IOException e) {
            edb.d("DownloadManager", "Failed to load download: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    private final etn d(etn etnVar, int i, int i2) {
        boolean z = false;
        if (i != 3) {
            if (i != 4) {
                z = true;
            } else {
                i = 4;
            }
        }
        a.ab(z);
        etn etnVarB = b(etnVar, i, i2);
        h(etnVarB);
        return etnVarB;
    }

    private final void e(etn etnVar, int i) {
        if (i == 0) {
            if (etnVar.b == 1) {
                d(etnVar, 0, 0);
            }
        } else if (i != etnVar.f) {
            int i2 = etnVar.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            h(new etn(etnVar.a, i2, etnVar.c, System.currentTimeMillis(), etnVar.e, i, 0, etnVar.h));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etz.f():void");
    }

    private final boolean g() {
        return !this.g && this.f == 0;
    }

    private final void h(etn etnVar) {
        int i = etnVar.b;
        a.ab((i == 3 || i == 4) ? false : true);
        int iA = a(etnVar.a.a);
        int i2 = 12;
        if (iA == -1) {
            ArrayList arrayList = this.d;
            arrayList.add(etnVar);
            Collections.sort(arrayList, new ade(i2));
        } else {
            long j = etnVar.c;
            ArrayList arrayList2 = this.d;
            long j2 = ((etn) arrayList2.get(iA)).c;
            arrayList2.set(iA, etnVar);
            if (j != j2) {
                Collections.sort(arrayList2, new ade(i2));
            }
        }
        try {
            this.b.d(etnVar);
        } catch (IOException e) {
            edb.d("DownloadManager", "Failed to update index.", e);
        }
        this.c.obtainMessage(3, new eyy(etnVar, false, new ArrayList(this.d), null)).sendToTarget();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0317  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etz.handleMessage(android.os.Message):void");
    }
}
