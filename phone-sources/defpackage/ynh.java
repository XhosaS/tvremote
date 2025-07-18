package defpackage;

import j$.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynh extends ygk implements Collection, java.util.Collection, yli {
    final /* synthetic */ aafi a;

    public ynh(aafi aafiVar) {
        this.a = aafiVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.regex.MatchResult] */
    @Override // defpackage.ygk
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.regex.MatchResult] */
    public final yng b(int i) {
        ?? r0 = this.a.a;
        ymd ymdVarR = ykn.r(r0.start(i), r0.end(i));
        if (ymdVarR.f().intValue() < 0) {
            return null;
        }
        String strGroup = r0.group(i);
        strGroup.getClass();
        return new yng(strGroup, ymdVarR);
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof yng)) {
            return super.contains((yng) obj);
        }
        return false;
    }

    @Override // defpackage.ygk, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<yng> iterator() {
        return new ync(new ynb(yfm.ar(new ymd(0, a() - 1)), (yjv) new ynk(this, 1), 2));
    }
}
