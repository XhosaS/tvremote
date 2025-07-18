package defpackage;

import android.content.BroadcastReceiver;
import com.google.android.libraries.appdoctor.AppDoctorReceiver;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awe implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ awe(cja cjaVar, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.c = i;
        this.b = cjaVar;
        this.a = pendingResult;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [cmz, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            return awh.c((awh) this.a, (cye) this.b);
        }
        if (i == 1) {
            AppDoctorReceiver.a(this.b, (BroadcastReceiver.PendingResult) this.a);
            return null;
        }
        dcq dcqVar = new dcq((byte[]) null);
        ?? r3 = this.b;
        Object obj = this.a;
        try {
            bzt bztVarE = ((bav) ((bdl) obj).b).e();
            Object obj2 = ((bdl) obj).c;
            bfg bfgVar = new bfg(r3);
            bfgVar.a = new dcq[]{dcqVar};
        } catch (IOException | RuntimeException e) {
            bdl bdlVar = (bdl) obj;
            awo.b(Level.WARNING, ((bav) bdlVar.b).b(), e, "Failed to update snapshot for %s flags may be stale.", bdlVar.d);
        }
        return null;
    }

    public /* synthetic */ awe(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
