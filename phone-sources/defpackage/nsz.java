package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsz extends nsv {
    public static final List l = new CopyOnWriteArrayList();
    public final List m;

    public nsz(Context context, String str, String str2) {
        this(context, str, str2, ntn.a, new nty(context), new nui(context), null);
    }

    public static nsz i(Context context, String str) {
        nsu nsuVar = new nsu(context, str);
        nsuVar.b(ntn.b);
        return nsuVar.a();
    }

    public static nsu j(Context context, String str) {
        nsu nsuVar = new nsu(context, str);
        nsuVar.b(ntn.c);
        return nsuVar;
    }

    @Deprecated
    public final nsy g(vvj vvjVar) {
        ocv.aF(vvjVar);
        return new nsy(this, vvjVar);
    }

    public final nsy h(vvj vvjVar, ntm ntmVar) {
        ocv.aF(vvjVar);
        nsy nsyVar = new nsy(this, vvjVar);
        nsyVar.q = ntmVar;
        return nsyVar;
    }

    public nsz(Context context, String str, String str2, ntn ntnVar, nta ntaVar, ntj ntjVar, ntc ntcVar) {
        super(context, str, str2, ntnVar, ntaVar, ntjVar, ntcVar);
        this.m = new CopyOnWriteArrayList();
    }
}
