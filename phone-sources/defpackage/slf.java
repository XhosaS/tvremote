package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slf {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final ufw c;
    public final String d;
    public final Handler e;
    public final ttm f;
    public final TimeUnit g;
    public final ListMultimap h = MultimapBuilder.treeKeys().arrayListValues().build();
    public final Object i = new Object();

    public slf(slc slcVar) {
        this.b = slcVar.a;
        this.c = slcVar.b;
        this.d = slcVar.c;
        this.e = slcVar.d;
        this.f = slcVar.e;
        this.g = slcVar.f;
    }

    public final void a(Uri uri) {
        Object obj = this.i;
        ImmutableList.Builder builder = ImmutableList.builder();
        synchronized (obj) {
            builder.addAll((Iterable) this.h.get((ListMultimap) uri));
        }
        UnmodifiableIterator it = builder.build().iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
