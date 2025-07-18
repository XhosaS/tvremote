package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qoi implements ttm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qoi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ttm
    public final Object get() {
        boolean zQ = false;
        switch (this.b) {
            case 0:
                snf snfVarE = ((qoj) this.a).a.e("/client_streamz/gnp_android/job/input_builder_result_count", new sne("app_package_name", String.class), new sne("is_success", Boolean.class));
                snfVarE.d();
                return snfVarE;
            case 1:
                snf snfVarE2 = ((qoj) this.a).a.e("/client_streamz/gnp_android/registration/registration_request_count", new sne("app_package_name", String.class), new sne("registration_reason", String.class), new sne("status", String.class), new sne("target_type", String.class));
                snfVarE2.d();
                return snfVarE2;
            case 2:
                snf snfVarE3 = ((qoj) this.a).a.e("/client_streamz/gnp_android/growthkit_logging_count", new sne("package_name", String.class), new sne("which_log", String.class), new sne("status", String.class));
                snfVarE3.d();
                return snfVarE3;
            case 3:
                qwn qwnVar = (qwn) this.a;
                return new rfk(qwnVar.e, qwnVar.b);
            case 4:
                Object obj = this.a;
                qwn qwnVar2 = (qwn) ((yyh) obj).b;
                rfg rfgVar = qwnVar2.e;
                tst tstVar = rfgVar.g;
                if (tstVar.g()) {
                    tst tstVar2 = rfgVar.l;
                    zQ = ((quy) tstVar.c()).q(ImmutableList.copyOf(Iterables.filter(qwnVar2.b.e(), new lqh(obj, 6))));
                }
                return Boolean.valueOf(zQ);
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.a;
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_selected_account, viewGroup);
                Button button = (Button) viewGroup.findViewById(R.id.og_bento_manage_your_google_account);
                TextViewContainer textViewContainer = (TextViewContainer) viewGroup.findViewById(R.id.og_bento_manage_your_google_account_container);
                button.getClass();
                xrk xrkVarA = textViewContainer.a(button);
                TextView textView = (TextView) viewGroup.findViewById(R.id.og_bento_selected_account_greeting_message);
                TextViewContainer textViewContainer2 = (TextViewContainer) viewGroup.findViewById(R.id.og_bento_selected_account_greeting_message_container);
                textView.getClass();
                xrk xrkVarA2 = textViewContainer2.a(textView);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.og_bento_selected_account_avatar);
                frameLayout.getClass();
                return new yyh(rdd.o(frameLayout), frameLayout, xrkVarA2, button, xrkVarA);
            case 6:
                return rdd.d((ViewGroup) this.a);
            case 7:
                FrameLayout frameLayout2 = (FrameLayout) this.a;
                ImageView imageView = new ImageView(frameLayout2.getContext());
                imageView.setContentDescription(null);
                imageView.setId(R.id.og_bento_card_icon);
                frameLayout2.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                return new cb(imageView, (byte[]) null);
            case 8:
                Object obj2 = this.a;
                obj2.getClass();
                unx unxVarO = rdd.o((ViewGroup) obj2);
                ((AvatarView) unxVarO.b).setId(R.id.og_bento_card_avatar_image);
                return unxVarO;
            case 9:
                Object obj3 = this.a;
                obj3.getClass();
                ViewGroup viewGroup2 = (ViewGroup) obj3;
                View viewInflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.og_bento_progress_content, viewGroup2);
                View viewFindViewById = viewInflate.findViewById(R.id.og_bento_card_progress_indicator);
                viewFindViewById.getClass();
                View viewFindViewById2 = viewInflate.findViewById(R.id.og_bento_card_progress_subtitle);
                viewFindViewById2.getClass();
                return new rzy((LinearProgressIndicator) viewFindViewById, new cb((TextView) viewFindViewById2, (byte[]) null), (char[]) null);
            case 10:
                Object obj4 = this.a;
                obj4.getClass();
                return rdd.d((ViewGroup) obj4);
            case 11:
                Object obj5 = this.a;
                obj5.getClass();
                return rdd.d((ViewGroup) obj5);
            case 12:
                ViewGroup viewGroup3 = (ViewGroup) this.a;
                AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup3.getContext());
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setIncludeFontPadding(false);
                appCompatTextView.setGravity(16);
                viewGroup3.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
                return new cb(appCompatTextView, (byte[]) null);
            case 13:
                ViewGroup viewGroup4 = (ViewGroup) this.a;
                ImageView imageView2 = new ImageView(viewGroup4.getContext());
                viewGroup4.addView(imageView2);
                return new cb(imageView2, (byte[]) null);
            case 14:
                qwn qwnVar3 = ((rhf) this.a).a;
                return new rfk(qwnVar3.e, qwnVar3.b);
            case 15:
                snf snfVarE4 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/invalid_user_profile_switch", new sne("app_package", String.class));
                snfVarE4.d();
                return snfVarE4;
            case 16:
                snf snfVarE5 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/load_owner_avatar_count", new sne("implementation", String.class), new sne("avatar_size", String.class), new sne("result", String.class), new sne("app_package", String.class), new sne("load_cached", Boolean.class));
                snfVarE5.d();
                return snfVarE5;
            case 17:
                snc sncVarC = ((snj) ((riv) this.a).a).c("/client_streamz/og_android/load_owners_latency", new sne("implementation", String.class), new sne("result", String.class), new sne("number_of_owners", Integer.class), new sne("app_package", String.class), new sne("load_cached", Boolean.class));
                sncVarC.d();
                return sncVarC;
            case 18:
                snc sncVarC2 = ((snj) ((riv) this.a).a).c("/client_streamz/og_android/load_owner_avatar_latency", new sne("implementation", String.class), new sne("avatar_size", String.class), new sne("result", String.class), new sne("app_package", String.class), new sne("load_cached", Boolean.class));
                sncVarC2.d();
                return sncVarC2;
            case 19:
                snf snfVarE6 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/profile_cache/get_people_me", new sne("result", String.class), new sne("app_package", String.class));
                snfVarE6.d();
                return snfVarE6;
            default:
                snf snfVarE7 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/lazy_provider_count", new sne("app_package", String.class));
                snfVarE7.d();
                return snfVarE7;
        }
    }
}
