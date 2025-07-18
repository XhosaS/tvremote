package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uus implements twz {
    private final /* synthetic */ int a;
    private final Object b;

    public uus(final Context context, yfo yfoVar, int i) {
        this.a = i;
        this.b = new uun(context, new uup(context), yfoVar, new yfo() { // from class: uuq
            @Override // defpackage.yfo, defpackage.yfn
            public final Object b() {
                Context context2 = context;
                try {
                    return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new AssertionError("Could not find our own package, this should be impossible.\nNo app version will appear in logs.", e);
                }
            }
        });
    }

    @Override // defpackage.twz
    public final tvw a(String str) {
        if (this.a != 0) {
            return (tvw) this.b;
        }
        Object obj = this.b;
        ImmutableList.Builder builder = ImmutableList.builder();
        UnmodifiableIterator it = ((ImmutableList) obj).iterator();
        while (it.hasNext()) {
            builder.add((ImmutableList.Builder) ((twz) it.next()).a(str));
        }
        return new uur(str, builder.build());
    }

    public uus(twz[] twzVarArr, int i) {
        this.a = i;
        this.b = ImmutableList.copyOf(twzVarArr);
    }
}
