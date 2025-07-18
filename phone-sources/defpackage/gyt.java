package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyt extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ gwj c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ cvi h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyt(cvi cviVar, gzu gzuVar, Object obj, gzy gzyVar, gwj gwjVar, gza gzaVar, qza qzaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.i = i;
        this.h = cviVar;
        this.d = gzuVar;
        this.b = obj;
        this.e = gzyVar;
        this.c = gwjVar;
        this.f = gzaVar;
        this.g = qzaVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            return ((gyt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gyt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.i == 0) {
            cvi cviVar = this.h;
            Object obj2 = this.d;
            Object obj3 = this.b;
            Object obj4 = this.e;
            return new gyt(cviVar, (gzu) obj2, obj3, (gzy) obj4, this.c, (gza) this.f, (qza) this.g, yihVar, 0);
        }
        cvi cviVar2 = this.h;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.g;
        gzu gzuVar = (gzu) obj7;
        ylf ylfVar = (ylf) obj6;
        return new gyt(cviVar2, (ylf) obj5, ylfVar, gzuVar, this.f, (ylf) this.b, this.c, yihVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [gzf, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objW;
        fse fseVarD;
        Bitmap bitmap;
        if (this.i != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i != 0) {
                return obj;
            }
            cvi cviVar = this.h;
            gyo gyoVar = (gyo) ((ylf) this.e).a;
            gag gagVar = (gag) ((ylf) this.d).a;
            Object obj2 = this.g;
            Object obj3 = this.f;
            gzy gzyVar = (gzy) ((ylf) this.b).a;
            gwj gwjVar = this.c;
            this.a = 1;
            Object objA = cviVar.A(gyoVar, gagVar, (gzu) obj2, obj3, gzyVar, gwjVar, this);
            return objA == yioVar ? yioVar : objA;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
            objW = obj;
        } else {
            ybn.f(obj);
            cvi cviVar2 = this.h;
            Object obj4 = this.d;
            Object obj5 = this.b;
            Object obj6 = this.e;
            gwj gwjVar2 = this.c;
            this.a = 1;
            objW = cviVar2.w((gzu) obj4, obj5, (gzy) obj6, gwjVar2, this);
            if (objW == yioVar2) {
                return yioVar2;
            }
        }
        cvi cviVar3 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.d;
        obk obkVar = (obk) objW;
        obkVar.getClass();
        gzu gzuVar = (gzu) obj8;
        boolean z = false;
        if (gzuVar.m.f && (fseVarD = ((riv) ((hfw) cviVar3.a).a).d()) != null && obj7 != null) {
            Object obj9 = obkVar.c;
            BitmapDrawable bitmapDrawable = obj9 instanceof BitmapDrawable ? (BitmapDrawable) obj9 : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(obkVar.b));
                Object obj10 = obkVar.d;
                if (obj10 != null) {
                    linkedHashMap.put("coil#disk_cache_key", obj10);
                }
                gzb gzbVar = new gzb(bitmap, linkedHashMap);
                gza gzaVar = (gza) obj7;
                String str = gzaVar.a;
                Map mapA = hjs.A(gzaVar.b);
                mapA.getClass();
                fseVarD.b.b(new gza(str, mapA), gzbVar.a, hjs.A(gzbVar.b));
                z = true;
            }
        }
        Object obj11 = obkVar.c;
        int i2 = obkVar.a;
        if (true != z) {
            obj7 = null;
        }
        Object obj12 = obkVar.d;
        boolean z2 = obkVar.b;
        hat.g((qza) this.g);
        return new hac((Drawable) obj11, gzuVar, i2, (gza) obj7, (String) obj12, z2, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyt(cvi cviVar, ylf ylfVar, ylf ylfVar2, gzu gzuVar, Object obj, ylf ylfVar3, gwj gwjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.i = i;
        this.h = cviVar;
        this.e = ylfVar;
        this.d = ylfVar2;
        this.g = gzuVar;
        this.f = obj;
        this.b = ylfVar3;
        this.c = gwjVar;
    }
}
