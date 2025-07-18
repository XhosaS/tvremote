package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hso implements hln {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public hso(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [hod, java.lang.Object] */
    @Override // defpackage.hln
    public final /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        hsl hslVar;
        hwf hwfVar;
        if (this.a != 0) {
            hnv hnvVarC = ((hte) this.b).c((Uri) obj, hllVar);
            if (hnvVarC == null) {
                return null;
            }
            return hrz.a(this.c, ((htb) hnvVarC).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof hsl) {
            hslVar = (hsl) inputStream;
            z = false;
        } else {
            z = true;
            hslVar = new hsl(inputStream, (hok) this.c);
        }
        Queue queue = hwf.a;
        synchronized (queue) {
            hwfVar = (hwf) queue.poll();
        }
        if (hwfVar == null) {
            hwfVar = new hwf();
        }
        hwf hwfVar2 = hwfVar;
        hwfVar2.b = hslVar;
        hwm hwmVar = new hwm(hwfVar2);
        hsn hsnVar = new hsn(hslVar, hwfVar2);
        try {
            Object obj2 = this.b;
            hnv hnvVarA = ((hrx) obj2).a(new hsh(hwmVar, ((hrx) obj2).f, ((hrx) obj2).g, 0), i, i2, hllVar, hsnVar);
            hwfVar2.a();
            if (z) {
                hslVar.b();
            }
            return hnvVarA;
        } finally {
        }
    }

    @Override // defpackage.hln
    public final /* synthetic */ boolean b(Object obj, hll hllVar) {
        if (this.a != 0) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        return true;
    }
}
