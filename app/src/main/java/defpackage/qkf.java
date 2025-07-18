package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkf implements daw {
    private final qjw a;
    private final int b;
    private final qkg c;

    public qkf(qjw qjwVar, qkg qkgVar, int i) {
        this.a = qjwVar;
        this.c = qkgVar;
        this.b = i;
    }

    @Override // defpackage.daw
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        int i = this.b;
        qjx qjxVarB = this.c.b();
        yqw.B(i >= 0, "Size must be bigger or equal to 0");
        yqw.B(qjw.a(qjxVarB), "handles(key) must be true");
        ArrayList arrayList = new ArrayList();
        qju qjuVar = (qju) qjxVarB;
        String str = qjuVar.b;
        qjw qjwVar = this.a;
        if (str != null) {
            arrayList.add(str);
        }
        if (i == 0) {
            i = 120;
        }
        String str2 = qjuVar.a;
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        urd urdVar = new urd(new urk(qjwVar.a.getApplicationContext(), new zwl()));
        int[] iArr = ure.a;
        urf urfVar = new urf(urdVar);
        tps tpsVar = url.a;
        urfVar.b(null);
        urfVar.a(null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int iA = urfVar.a(str2);
        CharSequence charSequenceB = urfVar.b(new qjv(strArr));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int height = bitmapCreateBitmap.getHeight();
        int width = bitmapCreateBitmap.getWidth();
        tps tpsVar2 = url.a;
        Paint paint = (Paint) tpsVar2.a();
        synchronized (tpsVar2) {
            paint.setColor(iA);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
            if (charSequenceB != null) {
                paint.setColor(-1);
                paint.setTextSize(Math.min(height, width) * 0.47f);
                String string = charSequenceB.toString();
                int length = charSequenceB.length();
                Rect rect = url.b;
                paint.getTextBounds(string, 0, length, rect);
                canvas.drawText(charSequenceB, 0, charSequenceB.length(), width / 2, (height / 2) - rect.exactCenterY(), paint);
            }
        }
        davVar.b(bitmapCreateBitmap);
    }

    @Override // defpackage.daw
    public final int g() {
        return 5;
    }

    @Override // defpackage.daw
    public final void cz() {
    }

    @Override // defpackage.daw
    public final void d() {
    }
}
