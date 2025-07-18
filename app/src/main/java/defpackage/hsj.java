package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.katniss.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hsj extends hoh {
    private static final zdy m = zdy.h("com/google/android/apps/tvsearch/results/searchslimentity/SlimEntityRow");
    public int l;
    private final Resources n;

    public hsj(Context context, PackageManager packageManager, exl exlVar, heq heqVar) {
        super(packageManager, exlVar, heqVar);
        this.n = context.getResources();
    }

    public final String B() {
        adyd adydVar = this.d;
        return adydVar != null ? adydVar.v : "";
    }

    @Override // defpackage.hoh
    public final void t() {
        aear aearVar;
        super.t();
        if (this.l == 1 || Collection.EL.stream(this.e).anyMatch(new Predicate() { // from class: hsi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((hej) obj).m;
            }
        }) || this.d.w) {
            return;
        }
        Resources resources = this.n;
        String string = resources == null ? "View More" : resources.getString(R.string.search_results_view_more);
        int i = this.l;
        if (i == 2) {
            aear aearVar2 = aear.a;
            aeao aeaoVar = new aeao();
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar3 = (aear) aeaoVar.b;
            aearVar3.k = 14;
            aearVar3.b |= 512;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar4 = (aear) aeaoVar.b;
            string.getClass();
            aearVar4.b |= 2;
            aearVar4.c = string;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar5 = (aear) aeaoVar.b;
            aearVar5.b |= 16;
            aearVar5.f = "com.google.android.katniss";
            aebk aebkVar = aebk.a;
            aebh aebhVar = new aebh();
            if ((aebhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aebhVar.y();
            }
            aebk aebkVar2 = (aebk) aebhVar.b;
            aebkVar2.b = 2 | aebkVar2.b;
            aebkVar2.d = "android.intent.action.VIEW";
            aebk aebkVar3 = (aebk) aebhVar.v();
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar6 = (aear) aeaoVar.b;
            aebkVar3.getClass();
            aearVar6.e = aebkVar3;
            aearVar6.b |= 8;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar7 = (aear) aeaoVar.b;
            aearVar7.b |= 16384;
            aearVar7.p = false;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar8 = (aear) aeaoVar.b;
            aearVar8.b = 32768 | aearVar8.b;
            aearVar8.q = false;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar9 = (aear) aeaoVar.b;
            aearVar9.b |= 8192;
            aearVar9.o = true;
            if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar.y();
            }
            aear aearVar10 = (aear) aeaoVar.b;
            aearVar10.b |= 64;
            aearVar10.h = 115334;
            aearVar = (aear) aeaoVar.v();
        } else if (i == 3) {
            adyd adydVar = this.d;
            if (adydVar == null || adydVar.r.isEmpty()) {
                ((zdv) ((zdv) m.d()).q("com/google/android/apps/tvsearch/results/searchslimentity/SlimEntityRow", "maybeAddFallbackEscapeHatch", 133, "SlimEntityRow.java")).u("Could not generate Fallback LauncherX Delegation Escape Hatch");
                return;
            }
            aear aearVar11 = aear.a;
            aeao aeaoVar2 = new aeao();
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar12 = (aear) aeaoVar2.b;
            aearVar12.k = 10;
            aearVar12.b |= 512;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar13 = (aear) aeaoVar2.b;
            string.getClass();
            aearVar13.b |= 2;
            aearVar13.c = string;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar14 = (aear) aeaoVar2.b;
            aearVar14.b |= 16;
            aearVar14.f = "com.google.android.apps.tv.launcherx";
            aebk aebkVar4 = aebk.a;
            aebh aebhVar2 = new aebh();
            if ((aebhVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aebhVar2.y();
            }
            aebk aebkVar5 = (aebk) aebhVar2.b;
            aebkVar5.b = 2 | aebkVar5.b;
            aebkVar5.d = "android.intent.action.VIEW";
            String string2 = Uri.parse("https://tv.google.com/asset/").buildUpon().appendPath(this.d.r).build().toString();
            if ((aebhVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aebhVar2.y();
            }
            aebk aebkVar6 = (aebk) aebhVar2.b;
            string2.getClass();
            aebkVar6.b |= 1;
            aebkVar6.c = string2;
            aebk aebkVar7 = (aebk) aebhVar2.v();
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar15 = (aear) aeaoVar2.b;
            aebkVar7.getClass();
            aearVar15.e = aebkVar7;
            aearVar15.b |= 8;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar16 = (aear) aeaoVar2.b;
            aearVar16.b |= 16384;
            aearVar16.p = false;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar17 = (aear) aeaoVar2.b;
            aearVar17.b = 32768 | aearVar17.b;
            aearVar17.q = false;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar18 = (aear) aeaoVar2.b;
            aearVar18.b |= 8192;
            aearVar18.o = true;
            if ((aeaoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeaoVar2.y();
            }
            aear aearVar19 = (aear) aeaoVar2.b;
            aearVar19.b |= 64;
            aearVar19.h = 115268;
            aearVar = (aear) aeaoVar2.v();
        } else {
            aearVar = null;
        }
        if (aearVar != null) {
            adyd adydVar2 = this.d;
            hej hejVarA = this.a.a(aearVar, adydVar2 == null ? "" : adydVar2.c);
            if (hejVarA != null) {
                s(hejVarA);
            }
        }
    }

    @Override // defpackage.hoh
    protected final boolean z(hej hejVar) {
        return hejVar != null && hejVar.l;
    }
}
