package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyw extends jyn {
    public static final List m = new CopyOnWriteArrayList();
    public final List n;

    public jyw(Context context, String str, String str2) {
        this(context, str, str2, kac.a, new kau(context), new kbh(context), null);
    }

    public static jyt g(Context context, String str) {
        jyt jytVar = new jyt(context, str);
        jytVar.a(kac.b);
        return jytVar;
    }

    @Deprecated
    public final jyv h(MessageLite messageLite) {
        kkk.k(messageLite);
        return new jyv(this, messageLite);
    }

    public final jyv i(MessageLite messageLite, kab kabVar) {
        kkk.k(messageLite);
        jyv jyvVar = new jyv(this, messageLite);
        jyvVar.p = kabVar;
        return jyvVar;
    }

    public jyw(Context context, String str, String str2, kac kacVar, jyx jyxVar, jzy jzyVar, jza jzaVar) {
        super(context, str, str2, kacVar, jyxVar, jzyVar, jzaVar);
        this.n = new CopyOnWriteArrayList();
    }
}
