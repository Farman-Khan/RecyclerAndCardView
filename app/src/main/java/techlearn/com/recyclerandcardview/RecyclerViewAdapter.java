package techlearn.com.recyclerandcardview;

/**
 * Created by farman on 6/25/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context context;

    private String[] headers={"Buy/Sell", "Cultivation", "Agri Real Estate","Videos"};
    private int[]  images={R.drawable.buy_sell, R.drawable.cultivation, R.drawable.agri_real_estate, R.drawable.videos};
    public RecyclerViewAdapter(Context context) {
        this.context = context;
    }



    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, null);
        MyHolder holder = new MyHolder(layoutView);
        return holder;
    }



    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        holder.title.setText(headers[position]);
        holder.image.setImageDrawable(context.getResources().getDrawable(images[position]));

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), " "+position, Toast.LENGTH_SHORT).show();
                Intent intent;
                switch (position){

                    case 0:
                        intent=new Intent(context, SecondActivity.class);
                        context.startActivity(intent);

                        break;

                    case 1:
                        intent=new Intent(context, SecondActivity.class);
                        context.startActivity(intent);

                        break;

                    case 2:
                        intent=new Intent(context, SecondActivity.class);
                        context.startActivity(intent);

                        break;

                    case 3:
                        intent=new Intent(context, SecondActivity.class);
                        context.startActivity(intent);

                        break;

                    default:
                        break;

                }


            }
        });




            }

    @Override
    public int getItemCount() {
        return headers.length;
    }


    public static class MyHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageView image;

        public MyHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.header);
            image = (ImageView) itemView.findViewById(R.id.content_image);
        }
    }

}