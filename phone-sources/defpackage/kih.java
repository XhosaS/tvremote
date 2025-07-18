package defpackage;

import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kih implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kih(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [cdv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v47, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        switch (this.b) {
            case 0:
                ((kiq) this.a).c(kgn.a);
                return ygi.a;
            case 1:
                ((kiq) this.a).c(kgo.a);
                return ygi.a;
            case 2:
                this.a.b(Boolean.valueOf(false));
                return ygi.a;
            case 3:
                this.a.b(Boolean.valueOf(false));
                return ygi.a;
            case 4:
                return Boolean.valueOf(this.a.d());
            case 5:
                return (ImageView) ((RottenTomatoesRatingView) this.a).findViewById(R.id.rotten_tomatoes_rating_image);
            case 6:
                return (TextView) ((RottenTomatoesRatingView) this.a).findViewById(R.id.rotten_tomatoes_rating_txt);
            case 7:
                TextView textView = (TextView) ((RottenTomatoesRatingView) this.a).findViewById(R.id.rotten_tomatoes_rating_read_more);
                if (textView == null) {
                    return null;
                }
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return textView;
            case 8:
                ((isy) ((klm) this.a).r().g).n(true, false);
                return ygi.a;
            case 9:
                return Integer.valueOf(((sj) this.a).c());
            case 10:
                return Boolean.valueOf(((sj) this.a).i());
            case 11:
                return a.w(this.a);
            case 12:
                return a.w(this.a);
            case 13:
                return a.w(this.a);
            case 14:
                jys.s(this.a, kob.a);
                return ygi.a;
            case 15:
                jys.s(this.a, kob.b);
                return ygi.a;
            case 16:
                jys.s(this.a, kob.c);
                return ygi.a;
            case 17:
                ?? r0 = this.a;
                yy yyVar = kpn.a;
                return a.w(r0);
            case 18:
                lgj lgjVar = (lgj) this.a;
                lgjVar.g.ea(lgjVar.i);
                return ygi.a;
            case 19:
                lgj lgjVar2 = (lgj) this.a;
                lgjVar2.g.ee(lgjVar2.i);
                return ygi.a;
            default:
                return mdw.b((mdw) this.a);
        }
    }
}
