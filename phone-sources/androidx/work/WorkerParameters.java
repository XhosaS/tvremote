package androidx.work;

import defpackage.gox;
import defpackage.gpe;
import defpackage.gqb;
import defpackage.isy;
import defpackage.yil;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final gox b;
    public final Set c;
    public final int d;
    public final Executor e;
    public final yil f;
    public final gqb g;
    public final gpe h;
    public final isy i;

    public WorkerParameters(UUID uuid, gox goxVar, Collection collection, int i, Executor executor, yil yilVar, isy isyVar, gqb gqbVar, gpe gpeVar) {
        this.a = uuid;
        this.b = goxVar;
        this.c = new HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = yilVar;
        this.i = isyVar;
        this.g = gqbVar;
        this.h = gpeVar;
    }
}
