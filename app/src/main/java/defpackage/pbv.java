package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbv {
    public final pcb a;
    public final pcn b;
    public pcm c;
    public int d = -1;

    public pbv(pcb pcbVar, pcn pcnVar) {
        this.a = pcbVar;
        this.b = pcnVar;
    }

    public final pcc a() {
        return (pcc) this.a.v();
    }

    public final boolean b() {
        zpk zpkVar = ((pcc) this.a.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        return (zpkVar.b & 8) != 0;
    }

    public final boolean c() {
        zpk zpkVar = ((pcc) this.a.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        return (zpkVar.b & 2048) != 0;
    }

    public final void d() {
        Set set = this.b.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionCleared: ".concat(toString()));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pcl) it.next()).a(this);
            }
        }
        pcb pcbVar = this.a;
        zpk zpkVar = ((pcc) pcbVar.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        zpj zpjVar = new zpj();
        zpjVar.B(zpkVar);
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar2 = (zpk) zpjVar.b;
        zpkVar2.f = null;
        zpkVar2.b &= -2049;
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar3 = (zpk) zpjVar.b;
        zpkVar3.b &= -2;
        zpkVar3.c = -1;
        zpk zpkVar4 = (zpk) zpjVar.v();
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        pcc pccVar = (pcc) pcbVar.b;
        zpkVar4.getClass();
        pccVar.d = zpkVar4;
        pccVar.b |= 1;
    }

    public final void e(int i) {
        if (i != 1) {
            i = 2;
        }
        pft pftVar = (pft) this.c;
        int i2 = pftVar.f;
        pftVar.f = i;
        if (!pftVar.e || i2 == i) {
            return;
        }
        pcn pcnVar = pftVar.b;
        pbv pbvVar = pftVar.a;
        Set set = pcnVar.a;
        if (set.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            String strValueOf = String.valueOf(pbvVar);
            String strA = zos.a(i2);
            if (i2 == 0) {
                throw null;
            }
            Log.v("GIL", "Visibility: " + strValueOf + "; " + strA + " -> " + zos.a(i));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((pcl) it.next()).g(pbvVar, i);
        }
    }

    public final String toString() {
        pcm pcmVar = this.c;
        String strConcat = pcmVar != null ? ".".concat(String.valueOf(pcmVar.getClass().getSimpleName())) : "";
        zpk zpkVar = ((pcc) this.a.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        return "CVE" + strConcat + "#" + zpkVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
