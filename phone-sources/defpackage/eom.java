package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eom extends Handler {
    final /* synthetic */ eoo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eom(eoo eooVar, Looper looper) {
        super(looper);
        this.a = eooVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.a.g(obj, obj2);
            return;
        }
        eoo eooVar = this.a;
        if (obj == eooVar.i) {
            if (eooVar.g == 2 || eooVar.j()) {
                eooVar.i = null;
                if (obj2 instanceof Exception) {
                    eooVar.j.h((Exception) obj2, false);
                    return;
                }
                try {
                    eooVar.b.provideProvisionResponse((byte[]) obj2);
                    ghc ghcVar = eooVar.j;
                    ghcVar.b = null;
                    ?? r6 = ghcVar.a;
                    ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) r6);
                    r6.clear();
                    UnmodifiableIterator it = immutableListCopyOf.iterator();
                    while (it.hasNext()) {
                        eoo eooVar2 = (eoo) it.next();
                        if (eooVar2.k()) {
                            eooVar2.e(true);
                        }
                    }
                } catch (Exception e) {
                    eooVar.j.h(e, true);
                }
            }
        }
    }
}
