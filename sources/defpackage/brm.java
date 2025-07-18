package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brm implements bqp {
    final /* synthetic */ BluetoothDevice a;
    final /* synthetic */ bro b;

    public brm(bro broVar, BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
        this.b = broVar;
    }

    @Override // defpackage.bqp
    public final bqq b(bqr bqrVar) {
        bro broVar = this.b;
        AtomicInteger atomicInteger = broVar.j;
        bsd bsdVar = broVar.i;
        long j = broVar.k;
        int i = 0;
        int andSet = atomicInteger.getAndSet(0);
        bsc bscVarA = bsdVar.a(bqrVar);
        if (andSet != 0) {
            clo cloVar = bscVarA.j;
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            bst bstVar = (bst) cloVar.b;
            bst bstVar2 = bst.a;
            bstVar.b |= 2048;
            bstVar.l = andSet;
            long j2 = bscVarA.b - j;
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            bst bstVar3 = (bst) cloVar.b;
            bstVar3.b |= 4096;
            bstVar3.m = j2;
        }
        return new brl(bscVarA, i);
    }

    public final String toString() {
        return this.a.toString();
    }
}
