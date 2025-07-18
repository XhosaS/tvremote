package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.TrackSelectionView;
import androidx.preference.Preference;
import com.google.android.apps.googletv.app.internal.BottomAppBarMaterialActivity;
import com.google.android.apps.googletv.app.internal.BottomSheetMaterialActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fsq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fsq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, yjk] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = false;
        switch (this.b) {
            case 0:
                PlayerControlView playerControlView = ((fsr) this.a).a;
                eao eaoVar = playerControlView.I;
                if (eaoVar == null || !eaoVar.q(29)) {
                    return;
                }
                ebf ebfVarO = playerControlView.I.O();
                eao eaoVar2 = playerControlView.I;
                String str = edt.a;
                eyu eyuVar = new eyu((eyv) ebfVarO);
                eyuVar.f(1);
                eyuVar.l(1, false);
                eaoVar2.af(new eyv(eyuVar));
                playerControlView.i.a(1, playerControlView.getResources().getString(R.string.exo_track_selection_auto));
                playerControlView.m.dismiss();
                return;
            case 1:
                PlayerControlView playerControlView2 = (PlayerControlView) this.a;
                boolean z2 = playerControlView2.K;
                boolean z3 = !z2;
                if (z2 == z3) {
                    return;
                }
                playerControlView2.K = z3;
                playerControlView2.g(playerControlView2.w, z3);
                playerControlView2.g(playerControlView2.x, z3);
                return;
            case 2:
                PlayerControlView playerControlView3 = ((fsx) this.a).a;
                eao eaoVar3 = playerControlView3.I;
                if (eaoVar3 == null || !eaoVar3.q(29)) {
                    return;
                }
                ebf ebfVarO2 = playerControlView3.I.O();
                eao eaoVar4 = playerControlView3.I;
                eyu eyuVar2 = new eyu((eyv) ebfVarO2);
                eyuVar2.f(3);
                eyuVar2.y = -3;
                eyuVar2.n(null);
                eyuVar2.k(0);
                eaoVar4.af(new eyv(eyuVar2));
                playerControlView3.m.dismiss();
                return;
            case 3:
                ftk ftkVar = (ftk) this.a;
                ftkVar.i();
                if (view.getId() == R.id.exo_overflow_show) {
                    ftkVar.m.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        ftkVar.n.start();
                        return;
                    }
                    return;
                }
            case 4:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.a;
                CheckedTextView checkedTextView = trackSelectionView.a;
                if (view == checkedTextView) {
                    trackSelectionView.e = true;
                    trackSelectionView.d.clear();
                } else {
                    if (view != trackSelectionView.b) {
                        trackSelectionView.e = false;
                        Object tag = view.getTag();
                        tag.getClass();
                        throw null;
                    }
                    trackSelectionView.e = false;
                    trackSelectionView.d.clear();
                }
                checkedTextView.setChecked(trackSelectionView.e);
                CheckedTextView checkedTextView2 = trackSelectionView.b;
                if (!trackSelectionView.e && trackSelectionView.d.size() == 0) {
                    z = true;
                }
                checkedTextView2.setChecked(z);
                throw null;
            case 5:
                ((Preference) this.a).b(view);
                return;
            case 6:
                ((iui) this.a).b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googletv/answer/11136134")));
                return;
            case 7:
                ((iul) this.a).b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googletv/answer/11136134")));
                return;
            case 8:
                this.a.a();
                return;
            case 9:
                Context context = ((View) this.a).getContext();
                context.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
                uriFromParts.getClass();
                intent.setData(uriFromParts);
                context.startActivity(intent);
                return;
            case 10:
                ((bl) this.a).dismiss();
                return;
            case 11:
                Toast.makeText((BottomAppBarMaterialActivity) this.a, "Clicked navigation item", 0).show();
                return;
            case 12:
                BottomAppBarMaterialActivity.$r8$lambda$Vh3WA1cSn5D8uZ1kip2YTRB6JOI((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 13:
                BottomAppBarMaterialActivity.$r8$lambda$DKN106NCzMi2XgcBx6WXqR4GhT4((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 14:
                BottomAppBarMaterialActivity.m84$r8$lambda$17w4A2dbR4baLflsQa3bMCgbY((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 15:
                BottomAppBarMaterialActivity.$r8$lambda$yNWAydPCEFp7IkQ6ChiWt3VUMZc((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 16:
                BottomAppBarMaterialActivity.$r8$lambda$EJpYQ4nH1LzyLeMna9TcOFWfwzE((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 17:
                BottomAppBarMaterialActivity.m85$r8$lambda$6c4lZaGBN0pPlMA6wT35PUxFKU((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 18:
                BottomAppBarMaterialActivity.$r8$lambda$nNiImgrxbHl40KB_xChKXBdI0mQ((BottomAppBarMaterialActivity) this.a, view);
                return;
            case 19:
                BottomAppBarMaterialActivity.m86$r8$lambda$kjdKOn1edctAFAJjX7mzumRrM((BottomAppBarMaterialActivity) this.a, view);
                return;
            default:
                BottomSheetMaterialActivity.m87$r8$lambda$hmMfPw4nO8fAySZDrciruoPOuE((BottomSheetMaterialActivity) this.a, view);
                return;
        }
    }

    public fsq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
