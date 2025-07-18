package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htw {
    public final htx a;

    public htw(htx htxVar) {
        this.a = htxVar;
    }

    public final int a(abow abowVar) {
        if (abowVar == null || abowVar.d.size() == 0) {
            return 1;
        }
        boolean z = false;
        aboi aboiVar = (aboi) abowVar.d.get(0);
        abxc abxcVar = abom.b;
        MessageLite messageLite = abxcVar.a;
        aboi aboiVar2 = aboi.a;
        if (messageLite != aboiVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = aboiVar.n;
        abxb abxbVar = abxcVar.d;
        if (!abwrVar.n(abxbVar)) {
            return 1;
        }
        if (messageLite != aboiVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = aboiVar.n.k(abxbVar);
        abom abomVar = (abom) (objK == null ? abxcVar.b : abxcVar.b(objK));
        if (abomVar.c.size() != 0) {
            Iterator it = abomVar.c.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String str = ((abol) it.next()).b;
                if (TextUtils.equals("tv_channel_id", str)) {
                    z = true;
                } else if (TextUtils.equals("tv_input_id", str)) {
                    z2 = true;
                }
            }
            if (z && !z2) {
                return 2;
            }
            if (z2 && !z) {
                return 3;
            }
        }
        return 1;
    }
}
