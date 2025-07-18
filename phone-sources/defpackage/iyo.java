package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyo implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iyo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                iyp iypVar = (iyp) this.a;
                iypVar.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                by byVarN = ihz.N(iypVar.b());
                if (byVarN != null) {
                    rtx.a.e(byVarN);
                    break;
                }
                break;
            case 1:
                ((cbc) this.a).J();
                break;
            case 2:
                jcm jcmVar = (jcm) this.a;
                PlayerView playerView = jcmVar.u;
                if (playerView != null) {
                    ImageView imageView = (ImageView) playerView.findViewById(R.id.left_panel);
                    ImageView imageView2 = (ImageView) playerView.findViewById(R.id.right_panel);
                    imageView.getClass();
                    imageView2.getClass();
                    jbr.n(imageView, imageView2, playerView);
                }
                PlayerControlView playerControlView = jcmVar.p;
                if (playerControlView != null) {
                    ImageView imageView3 = (ImageView) playerControlView.findViewById(R.id.left_panel);
                    ImageView imageView4 = (ImageView) playerControlView.findViewById(R.id.right_panel);
                    imageView3.getClass();
                    imageView4.getClass();
                    jbr.n(imageView3, imageView4, playerControlView);
                    break;
                }
                break;
            case 3:
                jdd jddVar = (jdd) this.a;
                PlayerView playerView2 = jddVar.ac;
                if (playerView2 != null) {
                    ImageView imageView5 = (ImageView) playerView2.findViewById(R.id.left_panel);
                    ImageView imageView6 = (ImageView) playerView2.findViewById(R.id.right_panel);
                    imageView5.getClass();
                    imageView6.getClass();
                    jbr.n(imageView5, imageView6, playerView2);
                }
                PlayerControlView playerControlView2 = jddVar.R;
                if (playerControlView2 != null) {
                    ImageView imageView7 = (ImageView) playerControlView2.findViewById(R.id.left_panel);
                    ImageView imageView8 = (ImageView) playerControlView2.findViewById(R.id.right_panel);
                    imageView7.getClass();
                    imageView8.getClass();
                    jbr.n(imageView7, imageView8, playerControlView2);
                    break;
                }
                break;
            case 4:
                jlz jlzVar = (jlz) this.a;
                if (jlzVar.m().getLineCount() < 3) {
                    jlzVar.m().setImportantForAccessibility(2);
                    jlzVar.m().setClickable(false);
                    break;
                }
                break;
            case 5:
                joq joqVar = (joq) this.a;
                joqVar.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                by byVarN2 = ihz.N(joqVar.b());
                if (byVarN2 != null) {
                    rtx.a.e(byVarN2);
                    break;
                }
                break;
            case 6:
                pqw pqwVar = (pqw) this.a;
                View view = pqwVar.g;
                if (view != null) {
                    if (view.getVisibility() == 0) {
                        Rect rect = new Rect();
                        pqwVar.g.getGlobalVisibleRect(rect);
                        if (!rect.equals(pqwVar.G)) {
                            pqwVar.G = rect;
                            Rect rect2 = new Rect();
                            pqwVar.g.getRootView().getGlobalVisibleRect(rect2);
                            if (!rect2.contains(pqwVar.G)) {
                                pqwVar.d(6);
                                break;
                            } else {
                                pqwVar.requestLayout();
                                break;
                            }
                        }
                    } else {
                        pqwVar.d(6);
                        break;
                    }
                }
                break;
            case 7:
                ((rlp) this.a).a();
                break;
            default:
                ((tam) this.a).l();
                break;
        }
    }

    public /* synthetic */ iyo(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
