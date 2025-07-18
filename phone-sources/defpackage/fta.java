package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fta implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fta(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ftk ftkVar = (ftk) obj;
                PlayerControlView playerControlView = ftkVar.a;
                int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                int height = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
                ViewGroup viewGroup = ftkVar.c;
                int iB = ftk.b(viewGroup) - (viewGroup != null ? viewGroup.getPaddingLeft() + viewGroup.getPaddingRight() : 0);
                int iA = ftk.a(viewGroup) - (viewGroup != null ? viewGroup.getPaddingTop() + viewGroup.getPaddingBottom() : 0);
                int iMax = Math.max(iB, ftk.b(ftkVar.i) + ftk.b(ftkVar.k));
                int iA2 = ftk.a(ftkVar.d);
                int i9 = iA2 + iA2;
                if (width > iMax && height > iA + i9) {
                    z2 = false;
                }
                if (ftkVar.t != z2) {
                    ftkVar.t = z2;
                    view.post(new foe(obj, 5));
                }
                int i10 = i3 - i;
                int i11 = i7 - i5;
                if (!ftkVar.t && i10 != i11) {
                    view.post(new foe(obj, 6));
                    break;
                }
                break;
            case 1:
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    PlayerControlView playerControlView2 = (PlayerControlView) this.a;
                    PopupWindow popupWindow = playerControlView2.m;
                    if (popupWindow.isShowing()) {
                        playerControlView2.m();
                        int width2 = playerControlView2.getWidth() - popupWindow.getWidth();
                        int i12 = playerControlView2.n;
                        popupWindow.update(view, width2 - i12, (-popupWindow.getHeight()) - i12, -1, -1);
                        break;
                    }
                }
                break;
            case 2:
                pqw pqwVar = (pqw) this.a;
                pqwVar.m();
                pqwVar.n(pqwVar.a());
                pqwVar.removeOnLayoutChangeListener(this);
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((bl) this.a).dismiss();
                break;
            case 4:
                view.removeOnLayoutChangeListener(this);
                int bottom = view.getBottom();
                View view2 = (View) this.a;
                view2.setPadding(view2.getPaddingLeft(), bottom - rrx.ah(view2.getResources().getDisplayMetrics(), 4), view2.getPaddingRight(), view2.getPaddingBottom());
                break;
            case 5:
                BottomAppBar.Behavior behavior = (BottomAppBar.Behavior) this.a;
                BottomAppBar bottomAppBar = (BottomAppBar) behavior.h.get();
                if (bottomAppBar != null && (((z = view instanceof FloatingActionButton)) || (view instanceof stk))) {
                    int height2 = view.getHeight();
                    if (z) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        Rect rect = behavior.g;
                        floatingActionButton.e(rect);
                        int iHeight = rect.height();
                        float f = iHeight;
                        if (f != bottomAppBar.k().c) {
                            bottomAppBar.k().c = f;
                            bottomAppBar.a.invalidateSelf();
                        }
                        szq szqVar = floatingActionButton.c().l;
                        szqVar.getClass();
                        float fA = szqVar.b.a(new RectF(rect));
                        if (fA != bottomAppBar.k().f) {
                            bottomAppBar.k().f = fA;
                            bottomAppBar.a.invalidateSelf();
                        }
                        height2 = iHeight;
                    }
                    cqx cqxVar = (cqx) view.getLayoutParams();
                    if (behavior.i == 0) {
                        if (bottomAppBar.f == 1) {
                            cqxVar.bottomMargin = bottomAppBar.o + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height2) / 2));
                        }
                        cqxVar.leftMargin = bottomAppBar.q;
                        cqxVar.rightMargin = bottomAppBar.p;
                        if (sil.p(view)) {
                            cqxVar.leftMargin += bottomAppBar.g;
                        } else {
                            cqxVar.rightMargin += bottomAppBar.g;
                        }
                    }
                    bottomAppBar.t();
                    break;
                } else {
                    view.removeOnLayoutChangeListener(this);
                    break;
                }
            case 6:
                svw svwVar = (svw) this.a;
                ImageView imageView = svwVar.e;
                if (imageView.getVisibility() == 0 && svwVar.L()) {
                    sin.a(svwVar.n, imageView);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) svwVar.c.getLayoutParams();
                int i13 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i14 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                if (svwVar.o == 1 && svwVar.k == -2) {
                    View view3 = svwVar.d;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view3.getLayoutParams();
                    if (svwVar.k != -2 || view3.getMeasuredWidth() == i13) {
                        z2 = false;
                    } else {
                        int i15 = svwVar.j;
                        int measuredWidth = svwVar.getMeasuredWidth();
                        int i16 = svwVar.m;
                        layoutParams2.width = Math.max(i13, Math.min(i15, measuredWidth - (i16 + i16)));
                    }
                    if (view3.getMeasuredHeight() < i14) {
                        layoutParams2.height = i14;
                    } else if (!z2) {
                    }
                    view3.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 7:
                ((View) this.a).getVisibility();
                break;
            default:
                ((tdg) this.a).c(view);
                break;
        }
    }

    public fta(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
