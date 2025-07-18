package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
class dlv {
    private final Queue a;

    public dlv() {
        char[] cArr = dqm.a;
        this.a = new ArrayDeque(0);
    }

    final synchronized czp a(ByteBuffer byteBuffer) {
        czp czpVar;
        czpVar = (czp) this.a.poll();
        if (czpVar == null) {
            czpVar = new czp();
        }
        czpVar.b = null;
        Arrays.fill(czpVar.a, (byte) 0);
        czpVar.c = new czo();
        czpVar.d = 0;
        czpVar.b = byteBuffer.asReadOnlyBuffer();
        czpVar.b.position(0);
        czpVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return czpVar;
    }

    final synchronized void b(czp czpVar) {
        czpVar.b = null;
        czpVar.c = null;
        this.a.offer(czpVar);
    }
}
