package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fqc(fpa fpaVar, int i, List list, fnw fnwVar, int i2) {
        this.e = i2;
        this.c = fpaVar;
        this.a = i;
        this.b = list;
        this.d = fnwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [fqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, rih] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            int i2 = this.a;
            Object obj = this.d;
            this.b.a((foo) this.c, (fnw) obj, i2);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                riy riyVar = ((rix) this.c).c;
                Object obj2 = this.b;
                riyVar.a.g((View) this.d, this.a, obj2);
                return;
            }
            Object obj3 = this.b;
            final qtx qtxVar = (qtx) this.d;
            final String str = (String) obj3;
            rig rigVar = new rig() { // from class: qtu
                @Override // defpackage.rig
                public final void a(Bitmap bitmap) {
                    qtx qtxVar2 = qtxVar;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(qtxVar2.a(bitmap));
                    qty.b.put(str, bitmapDrawable);
                    qtxVar2.e(bitmapDrawable, true);
                }
            };
            this.c.a(qtxVar.a, this.a, rigVar);
            return;
        }
        Object obj4 = this.c;
        int i3 = this.a;
        ?? r2 = this.b;
        if (i3 == -1) {
            ((fpa) obj4).c.b.q.ay(r2);
        } else {
            ((fpa) obj4).c.b.q.T(i3, r2);
        }
        Object obj5 = this.d;
        fph fphVar = ((fpa) obj4).c;
        int[] iArr = eaj.a;
        rin rinVar = new rin(null, null);
        rinVar.j(20);
        eaj.a(rinVar);
        fphVar.b.x((fnw) obj5);
    }

    public /* synthetic */ fqc(fqo fqoVar, foo fooVar, fnw fnwVar, int i, int i2) {
        this.e = i2;
        this.b = fqoVar;
        this.c = fooVar;
        this.d = fnwVar;
        this.a = i;
    }

    public /* synthetic */ fqc(qtx qtxVar, rih rihVar, int i, String str, int i2) {
        this.e = i2;
        this.d = qtxVar;
        this.c = rihVar;
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ fqc(rix rixVar, View view, int i, Object obj, int i2) {
        this.e = i2;
        this.c = rixVar;
        this.d = view;
        this.a = i;
        this.b = obj;
    }
}
